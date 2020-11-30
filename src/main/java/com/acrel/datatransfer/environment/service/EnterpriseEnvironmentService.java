package com.acrel.datatransfer.environment.service;

import com.acrel.datatransfer.environment.model.EnterpriseEnvironment;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ffy
 * @since 2020-11-22
 */
@DS("envrionment")
public interface EnterpriseEnvironmentService extends IService<EnterpriseEnvironment> {

}
