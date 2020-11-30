package com.acrel.datatransfer.canal.messagehandler.impl;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.acrel.datatransfer.canal.annotation.CanalTable;
import com.acrel.datatransfer.canal.entryhandler.EntryHandler;
import com.acrel.datatransfer.canal.messagehandler.MessageHandler;

import com.acrel.datatransfer.util.BeanUtil;
import com.alibaba.otter.canal.protocol.CanalEntry;
import com.alibaba.otter.canal.protocol.Message;
import lombok.extern.slf4j.Slf4j;
import com.alibaba.otter.canal.protocol.CanalEntry.Column;
import com.alibaba.otter.canal.protocol.CanalEntry.Entry;
import com.alibaba.otter.canal.protocol.CanalEntry.EntryType;
import com.alibaba.otter.canal.protocol.CanalEntry.EventType;
import com.alibaba.otter.canal.protocol.CanalEntry.RowChange;
import com.alibaba.otter.canal.protocol.CanalEntry.RowData;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
public class MessageHandlerImpl implements MessageHandler<Message> {
    /**
     * key 表名
     * value 对应处理器
     */
    private ConcurrentHashMap<String, EntryHandler> entryHandlerMap = new ConcurrentHashMap();
    /**
     * key 表名
     * value 对应Model
     */
    private ConcurrentHashMap<String, Class> modelMap = new ConcurrentHashMap();

    public MessageHandlerImpl() {
        //获取监听器
        List<EntryHandler> entryHandlerList = BeanUtil.getBeansOfType(EntryHandler.class);
        for (EntryHandler entryHandler : entryHandlerList) {
            CanalTable canalTable = entryHandler.getClass().getAnnotation(CanalTable.class);
            Class parameterizedType = BeanUtil.getSuperclassTypeParameter(entryHandler.getClass());
            if (canalTable != null) {
                String tableName = canalTable.value();
                entryHandlerMap.putIfAbsent(tableName, entryHandler);
                modelMap.putIfAbsent(tableName, parameterizedType);
            }
        }
    }

    @Override
    public void handleMessage(Message message) {
        entryHandle(message.getEntries());
    }


    private void entryHandle(List<Entry> entrys) {
        for (Entry entry : entrys) {
            if (entry.getEntryType() == EntryType.TRANSACTIONBEGIN || entry.getEntryType() == EntryType.TRANSACTIONEND) {
                continue;
            }
            RowChange rowChage = null;
            try {
                rowChage = RowChange.parseFrom(entry.getStoreValue());
            } catch (Exception e) {
                throw new RuntimeException("ERROR ## parser of eromanga-event has an error , data:" + entry.toString(),
                        e);
            }
            EventType eventType = rowChage.getEventType();

            log.info(String.format("================&gt; binlog[%s:%s] , name[%s,%s] , eventType : %s",
                    entry.getHeader().getLogfileName(), entry.getHeader().getLogfileOffset(),
                    entry.getHeader().getSchemaName(), entry.getHeader().getTableName(),
                    eventType));

            String tableName = entry.getHeader().getTableName();
            Class modelClazz = modelMap.get(tableName);
            EntryHandler entryHandler = entryHandlerMap.get(tableName);
            if (entryHandler == null) {
                log.error("没有找到该表[{}]对应的EntryHandler", tableName);
                return;
            }
            for (RowData rowData : rowChage.getRowDatasList()) {


                if (eventType == EventType.DELETE) {
                     log.info("----delete----");
                    logColumn(rowData.getBeforeColumnsList());
                    Object before = columnsToModel(rowData.getBeforeColumnsList(), modelClazz);
                    entryHandler.delete(before);
                } else if (eventType == EventType.INSERT) {
                    log.info("----insert----");
                    logColumn(rowData.getAfterColumnsList());
                    Object after = columnsToModel(rowData.getAfterColumnsList(), modelClazz);
                    entryHandler.insert(after);
                } else {
                    log.info("----update--Before--");
                    logColumn(rowData.getBeforeColumnsList());
                    log.info("----update--after--");
                    logColumn(rowData.getAfterColumnsList());
                    Object before = columnsToModel(rowData.getBeforeColumnsList(), modelClazz);
                    Object after = columnsToModel(rowData.getAfterColumnsList(), modelClazz);
                    entryHandler.update(before, after);
                }
            }
        }

    }

    /**
     * 将更新的字段转为model
     *
     * @param columnList
     * @param clazz
     * @return
     */
    private Object updatedColumnsToModel(List<CanalEntry.Column> columnList, Class clazz) {
        JSONObject josnObject = new JSONObject();
        String columName = "";
        for (Column column : columnList) {
            columName = column.getName().toLowerCase();
            if (columName.equals("id")) {
                josnObject.set("id", column.getValue());
            } else {
                if (column.getUpdated()) {
                    josnObject.set(columName, column.getValue());
                }
            }
        }
        Object object = josnObject.toBean(clazz);
        return object;

    }

    /**
     * 将所有的字段转为model
     *
     * @param columnList
     * @param clazz
     * @return
     */
    private Object columnsToModel(List<CanalEntry.Column> columnList, Class clazz) {
        JSONObject josnObject = new JSONObject();
        String columName = "";
        for (Column column : columnList) {
            columName = column.getName().toLowerCase();
            if (columName.equals("id")) {
                josnObject.set("id", column.getValue());
            } else {
                josnObject.set(columName, column.getValue());
            }
        }
        Object object = josnObject.toBean(clazz);
        return object;

    }



    private static void logColumn(List<Column> columns) {
        StringBuilder sb = new  StringBuilder();
        for (Column column : columns) {
            sb.append(column.getName()).append(":").append(column.getValue()).append(" update=").append(column.getUpdated()+";");
        }
        log.info("columns====[{}]",sb.toString());
    }


}
