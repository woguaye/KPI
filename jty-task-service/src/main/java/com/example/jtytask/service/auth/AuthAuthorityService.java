package com.example.jtytask.service.auth;

import com.example.jtykpi.dto.AuthAuthorityDto;

import java.util.List;

/**
 * 权限Service
 *
 * @author Jason
 * @since 2019/1/2 14:47
 */
public interface AuthAuthorityService {

    /**
     * 获取员工权限集合
     *
     * @param userId
     * @return
     */
    List<? extends GrantedAuthority> getAuthority(Integer userId);

    /**
     * 获取权限列表
     *
     * @return
     */
    List<AuthAuthorityDto> getAuthorities();

}
