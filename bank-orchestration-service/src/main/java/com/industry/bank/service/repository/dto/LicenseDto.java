package com.industry.bank.service.repository.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LicenseDto {

    private Long id;

    private int code;

    private String name;

    private List<RoleRequest> roles;
}
