package com.example.jtytask.service;

import com.example.jtykpi.form.PasswordForm;

/**
 * @Author: yeting
 * @Date: 2019/5/15 11:22
 */
public interface KpiAuthUserService {

    UserDetails getUserInfo(MyUserDetail user);

    void updatePassword(Integer userId, PasswordForm passwordForm);
}
