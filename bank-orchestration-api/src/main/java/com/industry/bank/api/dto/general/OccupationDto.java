package com.industry.bank.api.dto.general;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "OccupationDto")
public class OccupationDto {

    @Schema(name = "Code")
    private String code;

    @Schema(name = "value")
    private String value;

}