package com.hanzoy.xueta;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.hanzoy.xueta.mapper")
@EnableScheduling  //Springboot支持定时任务
public class XuetaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(XuetaApplication.class, args);
    }

}
