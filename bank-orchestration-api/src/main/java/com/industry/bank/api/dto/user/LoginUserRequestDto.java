package com.industry.bank.api.dto.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "LoginUserRequestDto" , title = "" , description = "")
public class LoginUserRequestDto {

    @Schema(title = "", name = "username", description = "", example = "201-1917")
    private String username;
    @Schema(title = "", name = "password", description = "", example = "*****")
    private String password;
}
