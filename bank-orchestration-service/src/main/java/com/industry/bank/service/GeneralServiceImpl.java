package com.industry.bank.service;

import com.industry.bank.api.dto.PageResponse;
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
    public PageResponse<NationalityDto> getNationalities() {
        return null;
    }

    @Override
    public NationalityDto getNationality(String nationalityCode) {
        return null;
    }

    @Override
    public PageResponse<CountryDto> getCountries() {
        return null;
    }

    @Override
    public CountryDto getCountry(String countryCode) {
        return null;
    }

    @Override
    public PageResponse<CityDto> getCities() {
        return null;
    }

    @Override
    public PageResponse<CityDto> getCountryCities(String countryCode) {
        return null;
    }

    @Override
    public CityDto getCity(String cityCode) {
        return null;
    }

    @Override
    public List<OccupationDto> getOccupations() {
        return null;
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