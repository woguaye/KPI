package com.example.jtyauth.support;


import com.example.jtyauth.client.ClientRepository;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * 组件注册
 *
 * @author jason
 * @since 2019/5/20
 */
@Component
public class DomainRegistry implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    //    public static LogIntegralRepository logIntegralRepository() {
//        return applicationContext.getBean(LogIntegralRepository.class);
//    }
//
    public static ClientRepository clientRepository() {
        return applicationContext.getBean(ClientRepository.class);
    }

    public static PasswordEncoder passwordEncoder() {
        return applicationContext.getBean(PasswordEncoder.class);
    }

    @Override
    public synchronized void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (DomainRegistry.applicationContext == null) {
            DomainRegistry.applicationContext = applicationContext;
        }
    }
}
