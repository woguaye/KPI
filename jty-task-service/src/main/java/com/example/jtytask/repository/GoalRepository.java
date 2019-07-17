package com.example.jtytask.repository;

import com.example.jtykpi.entity.Department;
import com.example.jtykpi.entity.Goal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @Author: yeting
 * @Date: 2019/6/27 10:12
 */
public interface GoalRepository extends JpaRepository<Goal, Integer>, JpaSpecificationExecutor<Goal> {

    List<Goal> findByDepartmentAndGoalFlagAndGoalState(Department department, Boolean goalFlag, Integer goalState);
}
