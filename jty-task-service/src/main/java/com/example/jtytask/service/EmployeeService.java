package com.example.jtytask.service;



import com.example.jtykpi.dto.ImportDetailDto;
import com.example.jtykpi.entity.Employee;

import java.util.List;

/**
 * EmployeeService
 *
 * @Author: yeting
 * @Date: 2019/6/5 8:53
 */
public interface EmployeeService {

    /**
     * 导入员工信息
     *
     * @param userId
     * @param departmentId
     * @param employeeList
     * @return
     */
    ImportDetailDto importEmployeeByManagement(Integer userId, Integer departmentId, List<Employee> employeeList);
}
