package com.industry.bank.api.dto.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "LoginUserRequestDto")
public class LoginUserRequestDto {

    @Schema(name = "username")
    private String username;

    @Schema(name = "password")
    private String password;

}
