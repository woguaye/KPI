package com.example.jtyauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 权限验证服务器启动类
 *
 * @EnableEurekaClient 让eureka发现该服务并注册到eureka上的注解
 * @Author: yeting
 * @Date: 2019/7/9 14:15
 */
@SpringBootApplication
@EnableEurekaClient
public class AuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthServerApplication.class, args);
    }
}
