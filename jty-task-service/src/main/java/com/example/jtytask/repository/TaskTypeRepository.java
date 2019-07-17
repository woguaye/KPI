package com.example.jtytask.repository;

import com.example.jtykpi.entity.TaskType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: yeting
 * @Date: 2019/5/23 9:57
 */
public interface TaskTypeRepository extends JpaRepository<TaskType, Integer> {
}
