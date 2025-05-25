package com.industry.bank.api.dto.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserResponseDto implements Serializable {
    @Schema(name = "jwt", accessMode = Schema.AccessMode.WRITE_ONLY)
    private String jwt;
}