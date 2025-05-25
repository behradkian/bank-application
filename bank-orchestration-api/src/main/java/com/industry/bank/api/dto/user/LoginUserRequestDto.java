package com.industry.bank.api.dto.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "LoginUserRequestDto")
public class LoginUserRequestDto implements Serializable {
    @Schema(name = "username")
    private String username;

    @Schema(name = "password")
    private String password;
}