package com.example.jtyauth.controller;


import com.example.jtyauth.service.AuthAuthorityService;
import com.example.jtyauth.support.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * KPIAuthorityController
 *
 * @Author: yeting
 * @Date: 2019/6/16 20:48
 */
@RestController
@RequestMapping(value = "/kpi")
public class KPIAuthorityController {

    @Autowired
    private AuthAuthorityService authorityService;

    /**
     * 获取权限列表
     *
     * @return
     */
    @GetMapping("/auth/manager-authority")
    @PreAuthorize("hasAuthority('KPI_MANAGE_ROLE')")
    public Result getKPIAuthorityAuthorities() {
        return Result.success(authorityService.getAuthorities());
    }
}
