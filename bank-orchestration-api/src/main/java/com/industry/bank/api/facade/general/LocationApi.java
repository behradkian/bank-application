package com.industry.bank.api.facade.general;

import com.industry.bank.api.dto.general.NationalityDto;
import com.industry.bank.api.dto.location.AddAddressResponseDto;
import com.industry.bank.api.dto.location.AddressDto;
import com.industry.bank.api.dto.location.CityDto;
import com.industry.bank.api.dto.location.CountryDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author : Pedram Behradkian
 * @date : 2025/06/05
 */
@FeignClient
public interface LocationApi {

    String PATH = "/general/location";

    @GetMapping(
            value = "/all-nationalities",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    List<NationalityDto> getAllNationalities(@RequestHeader Map<String, Object> headers);

    @GetMapping(
            value = "/get-nationality",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    NationalityDto getNationality(@RequestHeader Map<String, Object> headers,
                                  @RequestParam String nationalityCode);

    @GetMapping(
            value = "/all-countries",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    List<CountryDto> getAllCountries(@RequestHeader Map<String, Object> headers);

    @GetMapping(
            value = "/get-country",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    CountryDto getCountry(@RequestHeader Map<String, Object> headers,
                          @RequestParam String countryCode);

    @GetMapping(
            value = "/all-cities",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    List<CityDto> getAllCities(@RequestHeader Map<String, Object> headers);

    @GetMapping(
            value = "/get-country-cities",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    List<CityDto> getCountryCities(@RequestHeader Map<String, Object> headers,
                                   @RequestParam String countryCode);

    @GetMapping(
            value = "/get-city",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    CityDto getCity(@RequestHeader Map<String, Object> headers,
                    @RequestParam String cityCode);

    @GetMapping(
            value = "/get-address",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    AddressDto getAddress(@RequestHeader Map<String, Object> headers,
                          @RequestParam String postalCode);

    @PostMapping(
            value = "/add-address",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    AddAddressResponseDto addAddress(@RequestHeader Map<String, Object> headers,
                                     @RequestBody AddressDto addressDto);

}