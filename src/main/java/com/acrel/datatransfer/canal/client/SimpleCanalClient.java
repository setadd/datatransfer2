package com.acrel.datatransfer.canal.client;

import com.acrel.datatransfer.canal.config.CanalConfig;
import com.acrel.datatransfer.canal.messagehandler.MessageHandler;
import com.alibaba.otter.canal.client.CanalConnector;
import com.alibaba.otter.canal.client.CanalConnectors;
import com.alibaba.otter.canal.protocol.Message;
import lombok.extern.slf4j.Slf4j;

import java.net.InetSocketAddress;
import java.util.concurrent.TimeUnit;
@Slf4j
public class SimpleCanalClient implements ICanalClient{

    /**
     * 运行状态
     */
    private volatile boolean running;
    /**
     * 重连次数
     */
    private volatile int connectCount = 0;


    /**
     * canal 配置
     */
    private CanalConfig canalConfig;

    protected Long timeout = 1L;


    protected TimeUnit unit = TimeUnit.SECONDS;

    private MessageHandler messageHandler;

    private CanalConnector connector;

    public SimpleCanalClient(CanalConfig canalConfig,MessageHandler messageHandler) {
        this.canalConfig = canalConfig;
        this.messageHandler = messageHandler;

    }

    @Override
    public void start() {
        running = true;
        connector = CanalConnectors.newSingleConnector(new InetSocketAddress(canalConfig.getHost(), canalConfig.getPort()), canalConfig.getDestination(), canalConfig.getUserName(), canalConfig.getPassword());
        log.error("canal client 启动");
        while (running&&(connectCount<=canalConfig.getRetryCount())){
            try {
                connectCount++;
                connector.connect();
                connector.subscribe(canalConfig.getFilter());
                log.error("canal client 第[{}]次连接", connectCount);
                while (running) {
                    Thread.sleep(1000*10);
                    Message message = connector.getWithoutAck(canalConfig.getBatchSize(), timeout, unit);
                    long batchId = message.getId();

                    log.info("canal获取消息 id: {}",batchId);

                    if (message.getId() != -1 && message.getEntries().size() != 0) {
                        messageHandler.handleMessage(message);
                    }
                    connector.ack(batchId);
                }
            } catch (Exception e) {
                log.error("canal client 异常", e);
            } finally {
                connector.disconnect();
                log.error("canal client 关闭");
            }
            try {
                Thread.sleep(1000*60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void stop() {
        running = false;
    }

    @Override
    public boolean isRunning() {
        return running;
    }


}
