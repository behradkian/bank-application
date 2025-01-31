package com.industry.bank.service.repository.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountryRequest {

    private String countryId;
    private String countryCode;
    private String countryName;
    private List<CityRequest> cities;

}
