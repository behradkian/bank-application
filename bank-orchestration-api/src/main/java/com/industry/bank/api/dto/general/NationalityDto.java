package com.industry.bank.api.dto.general;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "NationalityDto", title = "", description = "")
public class NationalityDto {
    @Schema(name = "code", title = "${NationalityDto.code.title}", description = "${NationalityDto.code.description}")
    private String code;
    @Schema(name = "name", title = "${NationalityDto.name.title}", description = "${NationalityDto.name.description}")
    private String name;
}