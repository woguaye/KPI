package com.example.jtytask.repository;

import com.example.jtykpi.entity.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * 用户Repository
 *
 * @author Jason
 * @since 2018/12/22 08:56
 */
public interface UserRepository extends JpaRepository<AuthUser,Integer> {

    Optional<AuthUser> findByAccount(String account);

}
