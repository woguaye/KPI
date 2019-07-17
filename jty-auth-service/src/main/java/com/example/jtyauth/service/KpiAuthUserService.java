package com.example.jtyauth.service;


import com.example.jtyauth.form.PasswordForm;
import com.example.jtyauth.security.MyUserDetail;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @Author: yeting
 * @Date: 2019/5/15 11:22
 */
public interface KpiAuthUserService {

    UserDetails getUserInfo(MyUserDetail user);

    void updatePassword(Integer userId, PasswordForm passwordForm);
}
