package com.industry.bank.service.adapter.general;

import com.industry.bank.api.dto.location.CountryDto;
import com.industry.bank.service.repository.dto.CountryRequest;
import org.springframework.stereotype.Component;

/**
 * @author : Pedram Behradkian
 * @date : 2025/01/31
 */
@Component
public class CountryAdaptor {

    public CountryRequest adaptCountryRequest(CountryDto country) {
        if (country == null)
            return null;
        return CountryRequest.builder()
                .countryCode(country.getCode())
                .countryName(country.getName())
                .build();
    }

}
