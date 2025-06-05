package com.industry.bank.service;

import com.industry.bank.api.dto.general.NationalityDto;
import com.industry.bank.api.dto.general.OccupationDto;
import com.industry.bank.api.dto.location.*;
import com.industry.bank.service.api.GeneralService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class GeneralServiceImpl implements GeneralService {
    @Override
    public List<NationalityDto> getNationalities() {
        return List.of();
    }

    @Override
    public NationalityDto getNationality(String nationalityCode) {
        return null;
    }

    @Override
    public List<CountryDto> getCountries() {
        return List.of();
    }

    @Override
    public CountryDto getCountry(String countryCode) {
        return null;
    }

    @Override
    public List<CityDto> getCities() {
        return List.of();
    }

    @Override
    public List<CityDto> getCountryCities(String countryCode) {
        return List.of();
    }

    @Override
    public CityDto getCity(String cityCode) {
        return null;
    }

    @Override
    public List<OccupationDto> getOccupations() {
        return List.of();
    }

    @Override
    public OccupationDto getOccupation(String occupationCode) {
        return null;
    }

    @Override
    public AddressDto getAddress(String addressCode) {
        return null;
    }

    @Transactional
    @Override
    public AddAddressResponseDto addAddress(AddAddressRequestDto requestDto) {
        return null;
    }

}