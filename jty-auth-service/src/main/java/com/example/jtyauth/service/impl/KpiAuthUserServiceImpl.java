package com.example.jtyauth.service.impl;

import com.example.jtyauth.domain.AuthUser;
import com.example.jtyauth.form.PasswordForm;
import com.example.jtyauth.repository.UserRepository;
import com.example.jtyauth.security.MyUserDetail;
import com.example.jtyauth.service.KpiAuthUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

/**
 * @Author: yeting
 * @Date: 2019/5/15 11:22
 */
@Service
public class KpiAuthUserServiceImpl implements KpiAuthUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails getUserInfo(MyUserDetail user) {
        MyUserDetail myUserDetail = new MyUserDetail();
        myUserDetail.setUsername("yeting");
        return myUserDetail;
    }

    /**
     * 判断用户是否签到
     *
     * @param userId
     * @return
     */
    private Boolean checkSigned(Integer userId) {
        LocalDate localDate = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return null;
    }

    @Override
    public void updatePassword(Integer userId, PasswordForm passwordForm) {

    }
}
