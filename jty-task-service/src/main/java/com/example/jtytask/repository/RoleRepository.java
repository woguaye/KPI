package com.example.jtytask.repository;

import com.example.jtykpi.entity.AuthRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @Author: yeting
 * @Date: 2019/6/13 9:01
 */
public interface RoleRepository extends JpaRepository<AuthRole, Integer> {
    
    Optional<AuthRole> findByName(String name);
}
