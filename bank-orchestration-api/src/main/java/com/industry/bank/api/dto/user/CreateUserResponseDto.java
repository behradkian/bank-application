package com.industry.bank.api.dto.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserResponseDto {
    @Schema(title = "", name = "jwt", description = "", example = "erfan", required = true , accessMode = Schema.AccessMode.WRITE_ONLY)
    private String jwt;
}
