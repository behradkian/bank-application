package com.industry.bank.service.repository.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleRequest {

    private String roleId;
    private String roleCode;
    private String roleName;
    private List<UserRequest> users;
    private List<LicenseRequest> licenses;

}
