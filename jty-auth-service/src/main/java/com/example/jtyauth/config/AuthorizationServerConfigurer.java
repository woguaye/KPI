package com.example.jtyauth.config;


import com.example.jtyauth.security.MyClientDetailService;
import com.example.jtyauth.security.PerformanceUserDetailsService;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;

/**
 * 资源服务器配置类
 *
 * @author Jason
 * @since 2018/12/14 09:04
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfigurer extends AuthorizationServerConfigurerAdapter {


    private MyClientDetailService myClientDetailService;

    private PerformanceUserDetailsService myUserDetailService;



    public AuthorizationServerConfigurer(MyClientDetailService myClientDetailService, PerformanceUserDetailsService myUserDetailService) {
        this.myClientDetailService = myClientDetailService;
        this.myUserDetailService = myUserDetailService;
    }



    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.withClientDetails(myClientDetailService);
    }

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        super.configure(security);
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints
                .userDetailsService(myUserDetailService);

    }


}
