package com.example.jtykpi.dto;

import lombok.Data;

import java.util.Map;

/**
 * ImportDetailDto
 *
 * @Author: yeting
 * @Date: 2019/6/4 14:07
 */
@Data
public class ImportDetailDto {

    private Integer succeedCount;

    private Integer errorCount;

    private Map<Integer, Object> logs;
}
