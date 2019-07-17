package com.example.jtytask.repository;

import com.example.jtykpi.entity.LogStaffSign;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

/**
 * @Author: yeting
 * @Date: 2019/5/27 10:39
 */
public interface LogStaffSignRepository extends JpaRepository<LogStaffSign, Integer> {

    Optional<LogStaffSign> findByUserIdAndSignTime(Integer userId, LocalDate signTime);
}
