package com.satellite.usercenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.satellite.usercenter.mapper")
@EnableScheduling
public class HanPartnerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HanPartnerApplication.class, args);
    }

}
