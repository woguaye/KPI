package com.example.jtyauth.controller;


import com.example.jtyauth.annotation.MyLog;
import com.example.jtyauth.exception.BusinessException;
import com.example.jtyauth.form.PasswordForm;
import com.example.jtyauth.security.MyUserDetail;
import com.example.jtyauth.service.KpiAuthUserService;

import com.example.jtyauth.support.Result;
import com.example.jtyauth.support.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: yeting
 * @Date: 2019/5/14 22:00
 */
@RestController
@RequestMapping(value = "/kpi")
public class AuthUserController {

    @Autowired
    private KpiAuthUserService kpiAuthUserService;

    /**
     * 获取用户信息
     *
     * @param user
     * @return
     */
    @GetMapping("/auth/me")
    public Result getCurrentUser(@AuthenticationPrincipal MyUserDetail user) {
        return Result.success(kpiAuthUserService.getUserInfo(user));
    }

    /**
     * 修改密码
     *
     * @param user
     * @param passwordForm
     * @return
     */
    @MyLog(value = "修改密码")
    @PostMapping("/auth/reset/password")
    public Result changePassword(@AuthenticationPrincipal MyUserDetail user, @RequestBody PasswordForm passwordForm) {
        //设置浏览账号
        if ("41".equals(user.getUserId() + "")) {
            throw new BusinessException(ResultCode.USER_HAS_NOT_PERMISSION);
        }
        kpiAuthUserService.updatePassword(user.getUserId(), passwordForm);
        return Result.success();
    }

}
