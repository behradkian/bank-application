package com.industry.bank.service.repository.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleRequest {

    private Long id;

    private String code;

    private String name;

    private List<userRequest> users;

    private List<LicenseDto> licenses;
}
