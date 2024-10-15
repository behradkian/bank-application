package com.industry.bank.api.dto.general;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "OccupationDto", title = "", description = "")
public class OccupationDto {

    private String Code;

    private String value;

}
