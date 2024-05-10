package com.keelient.userservice.dto;

import lombok.*;

@Data
public class DepartmentDto {
    private Long id;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
