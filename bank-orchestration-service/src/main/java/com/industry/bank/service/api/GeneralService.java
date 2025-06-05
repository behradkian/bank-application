package com.industry.bank.service.api;

import com.industry.bank.api.dto.general.NationalityDto;
import com.industry.bank.api.dto.general.OccupationDto;
import com.industry.bank.api.dto.location.AddAddressResponseDto;
import com.industry.bank.api.dto.location.AddressDto;
import com.industry.bank.api.dto.location.CityDto;
import com.industry.bank.api.dto.location.CountryDto;

import java.util.List;

public interface GeneralService {

    List<NationalityDto> getNationalities();

    NationalityDto getNationality(String nationalityCode);

    List<CountryDto> getCountries();

    CountryDto getCountry(String countryCode);

    List<CityDto> getCities();

    List<CityDto> getCountryCities(String countryCode);

    CityDto getCity(String cityCode);

    List<OccupationDto> getOccupations();

    OccupationDto getOccupation(String occupationCode);

    AddressDto getAddress(String addressCode);

    AddAddressResponseDto addAddress(AddressDto addressDto);

}