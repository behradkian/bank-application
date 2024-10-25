package com.industry.bank.api.dto.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    @Schema(title = "", name = "firstName", description = "", example = "erfan")
    private String firstName;
    @Schema(title = "", name = "lastName", description = "", example = "javadi")
    private String lastName;
    @Schema(title = "", name = "mobileNumber", description = "", example = "09935640273")
    private String mobileNumber;
    @Schema(title = "", name = "birthdate", description = "", example = "1999/05/20")
    private Date birthdate;
    @Schema(title = "", name = "username", description = "", example = "201-1917", accessMode = Schema.AccessMode.WRITE_ONLY)
    private String username;
    @Schema(title = "", name = "password", description = "", example = "1917", accessMode = Schema.AccessMode.WRITE_ONLY)
    private String password;
    @Schema(title = "", name = "issueDate", description = "", example = "1403/07/30")
    private Date issueDate;
    @Schema(title = "", name = "expireDate", description = "", example = "1404/07/30")
    private Date expireDate;
    @Schema(title = "", name = "emailAddress", description = "", example = "erfanjavadi24@gmail.com")
    private String emailAddress;

}
