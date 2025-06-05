package com.industry.bank.controller.rest.general;

import com.industry.bank.api.dto.general.NationalityDto;
import com.industry.bank.api.dto.location.*;
import com.industry.bank.api.facade.general.LocationApi;
import com.industry.bank.service.api.GeneralService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author : Pedram Behradkian
 * @date : 2025/06/05
 */
@RestController
@AllArgsConstructor
@Tag(name = "${General.Location.Services}")
@RequestMapping(path = LocationApi.PATH)
public class LocationController implements LocationApi {

    private final GeneralService generalService;

    @Override
    public List<NationalityDto> getAllNationalities(Map<String, Object> headers) {
        return generalService.getNationalities();
    }

    @Override
    public NationalityDto getNationality(Map<String, Object> headers, String nationalityCode) {
        return generalService.getNationality(nationalityCode);
    }

    @Override
    public List<CountryDto> getAllCountries(Map<String, Object> headers) {
        return generalService.getCountries();
    }

    @Override
    public CountryDto getCountry(Map<String, Object> headers, String countryCode) {
        return generalService.getCountry(countryCode);
    }

    @Override
    public List<CityDto> getAllCities(Map<String, Object> headers) {
        return generalService.getCities();
    }

    @Override
    public List<CityDto> getCountryCities(Map<String, Object> headers, String countryCode) {
        return generalService.getCountryCities(countryCode);
    }

    @Override
    public CityDto getCity(Map<String, Object> headers, String cityCode) {
        return generalService.getCity(cityCode);
    }

    public AddressDto getAddress(Map<String, Object> headers, String postalCode) {
        return generalService.getAddress(postalCode);
    }

    @Override
    public AddAddressResponseDto addAddress(Map<String, Object> headers, AddAddressRequestDto requestDto) {
        return generalService.addAddress(requestDto);
    }

}