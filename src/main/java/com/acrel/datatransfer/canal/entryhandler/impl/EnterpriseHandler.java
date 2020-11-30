package com.acrel.datatransfer.canal.entryhandler.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.json.JSONUtil;
import com.acrel.datatransfer.canal.annotation.CanalTable;
import com.acrel.datatransfer.canal.entryhandler.EntryHandler;

import com.acrel.datatransfer.environment.model.EnterpriseEnvironment;
import com.acrel.datatransfer.environment.service.EnterpriseEnvironmentService;
import com.acrel.datatransfer.zhongjianku.model.EnterpriseZhongjianku;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@CanalTable("t_enterprise")
@Slf4j
public class EnterpriseHandler implements EntryHandler<EnterpriseZhongjianku> {
    @Autowired
    EnterpriseEnvironmentService enterpriseEnvironmentService;

    @Override
    public void update(EnterpriseZhongjianku before, EnterpriseZhongjianku after) {
        try {
            EnterpriseEnvironment enterpriseAfter = zhongjiankuModelToEnvironmentModel(after);
            enterpriseEnvironmentService.saveOrUpdate(enterpriseAfter);
        } catch (Exception e) {
            log.error(e.getMessage());
            log.error("数据更新失败before:[{}]===after[{}]",JSONUtil.toJsonStr(before),JSONUtil.toJsonStr(after));
        }
    }
    @Override
    public void insert(EnterpriseZhongjianku after) {
        try {
            EnterpriseEnvironment enterpriseAfter = zhongjiankuModelToEnvironmentModel(after);
            enterpriseEnvironmentService.save(enterpriseAfter);
        } catch (Exception e) {
            log.error(e.getMessage());
            log.error("数据插入失败before:[{}]",JSONUtil.toJsonStr(after));
        }
    }

    private  EnterpriseEnvironment  zhongjiankuModelToEnvironmentModel(EnterpriseZhongjianku source){
        EnterpriseEnvironment  target = new EnterpriseEnvironment();
        BeanUtil.copyProperties(source,target);
        return target;
    }

}
