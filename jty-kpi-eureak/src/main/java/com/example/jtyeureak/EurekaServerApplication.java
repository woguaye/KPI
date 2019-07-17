package com.example.jtyeureak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册服务器启动类
 *
 * @author yeting
 * @EnableEurekaServer注解，表示这个是一个Eureka注册中心
 * @since 2019/5/24 18:40
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
