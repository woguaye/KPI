package com.example.jtyrank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @Author: yeting
 * @Date: 2019/7/12 14:15
 */
@SpringBootApplication
@EnableEurekaClient
public class RankApplication {
    public static void main(String[] args) {
        SpringApplication.run(RankApplication.class, args);
    }
}
