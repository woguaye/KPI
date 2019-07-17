package com.example.jtyauth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * 认证服务器
 *
 * @EnableAuthorizationServer 该注解可以实现四种认证模式和token的生成，
 * @Author: yeting
 * @Date: 2019/7/11 9:02
 */
@Configuration
@EnableAuthorizationServer
public class PerformanceAuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
}
