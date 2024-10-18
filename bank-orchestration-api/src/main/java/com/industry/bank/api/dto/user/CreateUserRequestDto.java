package com.industry.bank.api.dto.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequestDto {

    @Schema(title = "", name = "user", description = "", example = "201-1917")
    private UserDto user;

    @Schema(title = "", name = "role", description = "", example = "admin")
    private RoleDto role;

}
