package com.industry.bank.api.dto.location;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "CountryDto")
public class CountryDto implements Serializable {
    @Schema(name = "code")
    private String code;

    @Schema(name = "name")
    private String name;
}