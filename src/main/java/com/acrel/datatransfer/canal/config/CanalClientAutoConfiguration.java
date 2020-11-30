package com.acrel.datatransfer.canal.config;

import com.acrel.datatransfer.canal.client.SimpleCanalClient;
import com.acrel.datatransfer.canal.messagehandler.MessageHandler;
import com.acrel.datatransfer.canal.messagehandler.impl.MessageHandlerImpl;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(CanalConfig.class)
public class CanalClientAutoConfiguration {


    @Bean
   public MessageHandler messageHandler(){
        MessageHandlerImpl messageHandlerImpl = new  MessageHandlerImpl();
        return messageHandlerImpl;
    }
    @Bean
    public SimpleCanalClient SimpleCanalClient(CanalConfig canalConfig,MessageHandler messageHandler){
        SimpleCanalClient  simpleCanalClient =   new  SimpleCanalClient(canalConfig,messageHandler);
        simpleCanalClient.start();
        return simpleCanalClient;
    }

}
