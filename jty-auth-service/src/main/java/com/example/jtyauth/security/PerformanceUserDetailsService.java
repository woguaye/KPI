package com.example.jtyauth.security;

import com.example.jtyauth.domain.AuthUser;
import com.example.jtyauth.exception.BusinessException;
import com.example.jtyauth.repository.UserRepository;
import com.example.jtyauth.service.AuthAuthorityService;
import com.example.jtyauth.support.ResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 处理登录校验逻辑
 *
 * @Author: yeting
 * @Date: 2019/5/14 19:31
 */
@Service
public class PerformanceUserDetailsService implements UserDetailsService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthAuthorityService authAuthorityService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        MyUserDetail detail = new MyUserDetail();
        logger.info("登录用户名" + s);
        AuthUser authUser = userRepository.findByAccount(s).orElseThrow(() -> new BusinessException(ResultCode.USER_LOGIN_ERROR));
        detail.setUserId(authUser.getId());
        detail.setUsername(authUser.getAccount());
        detail.setEnabled(authUser.getEnabled());
        detail.setAuthorities(authAuthorityService.getAuthority(authUser.getId()));
        detail.setPassword(authUser.getPassword());
        //根据用户名查找到用户信息
        return detail;
    }
}
