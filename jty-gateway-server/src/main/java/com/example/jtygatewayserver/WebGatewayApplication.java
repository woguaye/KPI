package com.example.jtygatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * web站点网关服务器
 *
 * @author Jason
 * @since 2018/12/20 10:42
 */
@SpringBootApplication
@EnableEurekaClient
public class WebGatewayApplication {

    public static void main(String[] args) {

        SpringApplication.run(WebGatewayApplication.class,args);
    }
}
