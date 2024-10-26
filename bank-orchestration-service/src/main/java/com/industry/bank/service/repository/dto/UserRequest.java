package com.industry.bank.service.repository.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    private String userId;
    private String firstName;
    private String lastName;
    private Date birthdate;
    private String username;
    private String password;
    private String nationalCode;
    private String mobileNumber;
    private String email;
    private Date issueDate;
    private Date expireDate;
    private BranchRequest branch;
    private DegreeRequest degree;
    private List<AddressRequest> addresses;
    private List<RoleRequest> roles;

}
