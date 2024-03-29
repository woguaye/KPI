package com.example.jtyauth.repository;

import com.example.jtyauth.domain.AuthAuthority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 权限Repository
 *
 * @author Jason
 * @since 2018/12/22 09:00
 */
public interface AuthorityRepository extends JpaRepository<AuthAuthority, Integer>, JpaSpecificationExecutor<AuthAuthority> {
}
