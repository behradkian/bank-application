package com.industry.bank.api.dto.location;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "CityDto" , title = "${CityDto.title}" , description = "${CityDto.description}")
public class CityDto {

    @Schema(name = "country" , title = "${CityDto.country.title}" , description = "${CityDto.country.title}")
    private CountryDto country;

    @Schema(name = "code" , title = "${CityDto.code.title}" , description = "${CityDto.code.title}")
    private String code;

    @Schema(name = "name" , title = "${CityDto.name.title}" , description = "${CityDto.name.title}")
    private String name;

}