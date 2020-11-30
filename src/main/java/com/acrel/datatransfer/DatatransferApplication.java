package com.acrel.datatransfer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.acrel.datatransfer.*.mapper")
public class DatatransferApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatatransferApplication.class, args);
    }

}
