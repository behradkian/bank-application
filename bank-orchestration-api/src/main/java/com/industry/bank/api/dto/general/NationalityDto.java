package com.industry.bank.api.dto.general;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "NationalityDto")
public class NationalityDto {

    @Schema(name = "code")
    private String code;

    @Schema(name = "name")
    private String name;

}