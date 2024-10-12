package com.industry.bank.api.dto.location;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityDto {

    private CountryDto country;
    private String code;
    private String name;
}
