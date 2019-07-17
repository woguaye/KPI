package com.example.jtyauth.form;

import lombok.Data;

/**
 * KPIManagerSearchForm
 *
 * @author Jason
 * @since 2019/1/17 13:38
 */
@Data
public class KPIManagerSearchForm extends PageableForm {

    private Integer roleId;

    private Boolean enabled;


    private String account;

    /**
     * 部门ID
     */
    private String deptId;
}
