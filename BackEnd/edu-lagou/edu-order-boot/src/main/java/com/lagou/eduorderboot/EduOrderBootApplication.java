package com.lagou.eduorderboot;


import org.apache.shardingsphere.shardingjdbc.spring.boot.SpringBootConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(exclude={SpringBootConfiguration.class}) // 使用 Spring.shardingJDBC
@EnableEurekaClient
@MapperScan("com.lagou.eduorderboot.mapper")
public class EduOrderBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(EduOrderBootApplication.class, args);
    }

}