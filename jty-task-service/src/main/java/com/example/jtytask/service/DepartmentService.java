package com.example.jtytask.service;

import com.example.jtykpi.dto.DepartmentTreeDto;
import com.example.jtykpi.dto.KpiDepartmentDto;
import com.example.jtykpi.form.DepartmentForm;


import java.util.List;

/**
 * @Author: yeting
 * @Date: 2019/6/17 9:24
 */
public interface DepartmentService {

    /**
     * 新建中心部门
     *
     * @param form
     * @return
     */
    KpiDepartmentDto addDepartmentCore(DepartmentForm form);


    /**
     * 创建中心子部门
     *
     * @param deptIdCore
     * @param form
     * @return
     */
    KpiDepartmentDto addDepartmentChild(Integer deptIdCore, DepartmentForm form);

    /**
     * 获取部门树
     *
     * @param user
     * @return
     */
    List<DepartmentTreeDto> getDepartmentsByAuth(MyUserDetail user);


    /**
     * 编辑部门信息
     *
     * @param deptId
     * @param form
     * @return
     */
    KpiDepartmentDto alterDepartment(Integer deptId, DepartmentForm form);

    /**
     * 获取部门树
     *
     * @return
     */
    List<DepartmentTreeDto> getDepartmentCores();
}
