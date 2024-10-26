package com.industry.bank.service.repository.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityRequest {

    private String cityId;
    private String cityCode;
    private String cityName;
    private CountryRequest country;

}
