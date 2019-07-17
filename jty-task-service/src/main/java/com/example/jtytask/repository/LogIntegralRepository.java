package com.example.jtytask.repository;

import com.example.jtykpi.entity.Employee;
import com.example.jtykpi.entity.LogIntegral;
import com.example.jtykpi.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

/**
 * @Author: yeting
 * @Date: 2019/4/27 17:58
 */
public interface LogIntegralRepository extends JpaRepository<LogIntegral, Integer>, JpaSpecificationExecutor<LogIntegral> {

    Optional<LogIntegral> findByEmployeeAndTask(Employee employee, Task task);

}
