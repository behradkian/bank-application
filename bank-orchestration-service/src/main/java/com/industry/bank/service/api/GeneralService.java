package com.industry.bank.service.api;

import com.industry.bank.api.dto.PageResponse;
import com.industry.bank.api.dto.general.NationalityDto;
import com.industry.bank.api.dto.general.OccupationDto;
import com.industry.bank.api.dto.location.*;

import java.util.List;

public interface GeneralService {

    PageResponse<NationalityDto> getNationalities();

    NationalityDto getNationality(String nationalityCode);

    PageResponse<CountryDto> getCountries();

    CountryDto getCountry(String countryCode);

    PageResponse<CityDto> getCities();

    PageResponse<CityDto> getCountryCities(String countryCode);

    CityDto getCity(String cityCode);

    List<OccupationDto> getOccupations();

    OccupationDto getOccupation(String occupationCode);

    AddressDto getAddress(String addressCode);

    AddAddressResponseDto addAddress(AddAddressRequestDto addressDto);

}