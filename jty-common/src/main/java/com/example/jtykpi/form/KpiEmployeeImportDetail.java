package com.example.jtykpi.form;

import lombok.Data;

/**
 *
 */
@Data
public class KpiEmployeeImportDetail extends EmployeeForm {
    private boolean succeed;
    private String errorMessage;
}
