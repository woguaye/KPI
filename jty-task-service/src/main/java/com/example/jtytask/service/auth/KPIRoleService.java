package com.example.jtytask.service.auth;

import com.example.jtykpi.entity.AuthRole;
import com.example.jtykpi.form.AuthRoleForm;
import org.springframework.data.domain.Page;

/**
 * @Author: yeting
 * @Date: 2019/6/14 15:34
 */
public interface KPIRoleService {


    /**
     * 查询角色列表
     *
     * @param form
     * @return
     */
    Page<AuthRole> findPageRolesBySystem(AuthRoleForm form);

    /**
     * 新增角色
     *
     * @param form
     */
    void addRole(AuthRoleForm form);

    /**
     * 设置角色权限
     *
     * @param roleId
     * @param form
     */
    void updateRole(Integer roleId, AuthRoleForm form);

    /**
     * 获取角色详情
     *
     * @param roleId
     * @return
     */
    AuthRole getRoleById(Integer roleId);
}
