package com.example.jtytask.service.auth.impl;

import com.example.jtykpi.entity.AuthAuthority;
import com.example.jtykpi.entity.AuthRole;
import com.example.jtykpi.exception.BusinessException;
import com.example.jtykpi.form.AuthRoleForm;
import com.example.jtykpi.support.ResultCode;
import com.example.jtytask.repository.AuthorityRepository;
import com.example.jtytask.repository.RoleRepository;
import com.example.jtytask.service.auth.KPIRoleService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.HashSet;

/**
 * @Author: yeting
 * @Date: 2019/6/14 15:35
 */
@Service
public class RoleServiceImpl implements KPIRoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private AuthorityRepository authorityRepository;

    @Override
    public Page<AuthRole> findPageRolesBySystem(AuthRoleForm form) {
        return roleRepository.findAll(form.getPageable());
    }

    @Override
    public void addRole(AuthRoleForm form) {
        AuthRole authRole = roleRepository.findByName(form.getName()).orElse(null);
        if (authRole != null) {
            throw new BusinessException(ResultCode.ROLE_HAS_EXIST);
        }
        authRole = new AuthRole();
        authRole.setName(form.getName());
        roleRepository.save(authRole);
    }

    @Override
    public void updateRole(Integer roleId, AuthRoleForm form) {
        AuthRole authRoleById = roleRepository.findById(roleId).orElseThrow(() -> new BusinessException(ResultCode.DATA_IS_WRONG));
        HashSet<AuthAuthority> authAuthorities = new HashSet<>();
        if (CollectionUtils.isNotEmpty(form.getAuthAuthoritiesIds())) {
            authRoleById.getAuthorities().clear();
            for (Integer authId : form.getAuthAuthoritiesIds()) {
                AuthAuthority authAuthority = authorityRepository.findById(authId).orElseThrow(() -> new BusinessException(ResultCode.DATA_IS_WRONG));
                authAuthorities.add(authAuthority);
            }
            authRoleById.setAuthorities(authAuthorities);
        }
        roleRepository.save(authRoleById);

    }

    @Override
    public AuthRole getRoleById(Integer roleId) {
        return roleRepository.findById(roleId).orElseThrow(() -> new BusinessException(ResultCode.DATA_IS_WRONG));
    }
}
