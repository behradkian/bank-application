package com.industry.bank.api.dto.general;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "OccupationDto", title = "${OccupationDto.title}", description = "${OccupationDto.description}")
public class OccupationDto {

    @Schema(name = "Code", title = "${OccupationDto.code.title}", description = "${OccupationDto.code.description}")
    private String Code;
    @Schema(name = "value", title = "${OccupationDto.value.title}", description = "${OccupationDto.value.description}")
    private String value;

}