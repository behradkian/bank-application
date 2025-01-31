package com.industry.bank.service.adapter.general;

import com.industry.bank.api.dto.location.CityDto;
import com.industry.bank.service.repository.dto.CityRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author : Pedram Behradkian
 * @date : 2025/01/31
 */
@AllArgsConstructor
@Component
public class CityAdapter {

    private final CountryAdaptor countryAdaptor;

    public CityRequest adaptCityRequest(CityDto city) {
        if (city == null)
            return null;
        return CityRequest.builder()
                .cityCode(city.getCode())
                .cityName(city.getName())
                .country(countryAdaptor.adaptCountryRequest(city.getCountry()))
                .build();
    }

}
