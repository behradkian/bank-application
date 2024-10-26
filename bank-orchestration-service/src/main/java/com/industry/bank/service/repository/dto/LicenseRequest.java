package com.industry.bank.service.repository.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LicenseRequest {

    private String licenceId;
    private String licenceCode;
    private String licenceName;
    private List<RoleRequest> roles;

}
