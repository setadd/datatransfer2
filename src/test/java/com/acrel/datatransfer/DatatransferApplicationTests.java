package com.acrel.datatransfer;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.acrel.datatransfer.environment.model.EnterpriseEnvironment;
import com.acrel.datatransfer.environment.service.EnterpriseEnvironmentService;
import com.acrel.datatransfer.zhongjianku.service.EnterpriseZhongjiankuService;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Field;
import java.util.List;
@Slf4j
@SpringBootTest
class DatatransferApplicationTests {
    @Autowired
    EnterpriseEnvironmentService     enterpriseEnvironmentService;
    @Autowired
    EnterpriseZhongjiankuService      enterpriseZhongjiankuService;
    @Test
    public void test(){
        EnterpriseEnvironment  object = new  EnterpriseEnvironment();
        object.setId("37");
        object.setAddress("c");
        object.setRemark("cc");
        enterpriseEnvironmentService.saveOrUpdate(object);
    }

   /// @Test
    void contextLoads() {
//       List< com.acrel.datatransfer.environment.model.EnterpriseEnvironment> list = enterpriseEnvironmentService.list();
////        List< com.acrel.datatransfer.zhongjianku.model. EnterpriseZhongjianku> list2 = enterpriseZhongjiankuService.list();
////        System.out.println( JSONUtil.toJsonStr(list));
////        System.out.println( JSONUtil.toJsonStr(list2));
        JSONObject josnObject = new JSONObject();
        josnObject.set("isdeleted","1");
        josnObject.set("producelevel","1");
        josnObject.set("limitevalue","1.2342434");
        josnObject.set("createdate","2020-08-18 11:47:25");
        EnterpriseEnvironment  enterpriseEnvironment = josnObject.toBean(EnterpriseEnvironment.class);
        Field[]  fileldArr  =   EnterpriseEnvironment.class.getDeclaredFields();
        for(Field field :fileldArr){
            log.info(field.getName());
            if(field.getAnnotation(TableField.class)!=null){
                log.info(field.getAnnotation(TableField.class).value());
            }

        }


       log.info(JSONUtil.toJsonStr(enterpriseEnvironment));

    }

}
