package com.industry.bank.api.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String firstName;
    private String lastName;
    private String mobileNumber;
    private Date birthdate;
    private String username;
    private String password;
    private Date issueDate;
    private Date expireDate;
    private String emailAddress;

}
