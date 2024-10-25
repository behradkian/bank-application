package com.industry.bank.api.dto.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "LoginUserResponseDto" , title = "" , description = "")
public class LoginUserResponseDto {
    @Schema(name = "jwt" , title = "" , description = "")
    private String jwt;
}
