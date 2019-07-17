package com.example.jtyauth.repository;

import com.example.jtyauth.domain.AuthRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @Author: yeting
 * @Date: 2019/6/13 9:01
 */
public interface RoleRepository extends JpaRepository<AuthRole, Integer> {
    
    Optional<AuthRole> findByName(String name);
}
