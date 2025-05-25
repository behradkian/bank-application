package com.industry.bank.api.dto.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto implements Serializable {
    @Schema(name = "firstName")
    private String firstName;

    @Schema(name = "lastName")
    private String lastName;

    @Schema(name = "mobileNumber")
    private String mobileNumber;

    @Schema(name = "birthdate")
    private Date birthdate;

    @Schema(name = "username", accessMode = Schema.AccessMode.WRITE_ONLY)
    private String username;

    @Schema(name = "password", accessMode = Schema.AccessMode.WRITE_ONLY)
    private String password;

    @Schema(name = "email")
    private String email;
}