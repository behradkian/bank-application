package com.industry.bank.service.repository.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Long userId;

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

    private BranchDto branch;

    private List<RoleDto> roles;

    private DegreeDto degree;

    private List<AddressDto> addresses;

}
