package com.industry.bank.service.repository.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BranchRequest {

    private String branchId;
    private String branchCode;
    private String description;
    private List<UserRequest> users;
    private AddressRequest address;
}
