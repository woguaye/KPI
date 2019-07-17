package com.example.jtyauth.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author Jason
 * @since 2019/1/17 10:47
 */
@Data
public class KPIManagerDTO extends SuperDto {

    private String account;

    private String realName;

    private Boolean enabled;

    private String position;

    private List<KPIRoleDto> roles;

    private List<Integer> deptIds;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lastLoginTime;
}
