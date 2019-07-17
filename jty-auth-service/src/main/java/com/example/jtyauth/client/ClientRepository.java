package com.example.jtyauth.client;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @Author: yeting
 * @Date: 2019/7/12 20:39
 */
public interface ClientRepository extends JpaRepository<AuthClient, Integer> {
    Optional<AuthClient> findByUserId(Integer id);

    Optional<AuthClient> findByClientId(String clientId);
}
