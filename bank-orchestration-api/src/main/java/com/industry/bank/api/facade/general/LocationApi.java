package com.industry.bank.api.facade.general;

import com.industry.bank.api.dto.PageResponse;
import com.industry.bank.api.dto.general.NationalityDto;
import com.industry.bank.api.dto.location.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author : Pedram Behradkian
 * @date : 2025/06/05
 */
@FeignClient
public interface LocationApi {

    String PATH = "/general/location";

    @Operation(
            operationId = "getAllNationalities",
            summary = "${api.getAllNationalities.summary}",
            description = "${api.getAllNationalities.description}",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful"),
                    @ApiResponse(responseCode = "400", description = "Failed")
            })
    @GetMapping(
            value = "/all-nationalities",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    PageResponse<NationalityDto> getAllNationalities(@RequestHeader Map<String, Object> headers,
                                                     @Parameter(description = "${api.page}") @RequestParam(name = "page", defaultValue = "0") int page,
                                                     @Parameter(description = "${api.size}") @RequestParam(name = "size", defaultValue = "10") int size);

    @Operation(
            operationId = "getNationality",
            summary = "${api.getNationality.summary}",
            description = "${api.getNationality.description}",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful"),
                    @ApiResponse(responseCode = "400", description = "Failed")
            })
    @GetMapping(
            value = "/get-nationality",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    NationalityDto getNationality(@RequestHeader Map<String, Object> headers,
                                  @Parameter(description = "${}") @RequestParam("nationalityCode") String nationalityCode);

    @Operation(
            operationId = "getAllCountries",
            summary = "${api.getAllCountries.summary}",
            description = "${api.getAllCountries.description}",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful"),
                    @ApiResponse(responseCode = "400", description = "Failed")
            })
    @GetMapping(
            value = "/all-countries",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    PageResponse<CountryDto> getAllCountries(@RequestHeader Map<String, Object> headers,
                                             @Parameter(description = "${api.page}") @RequestParam(name = "page", defaultValue = "0") int page,
                                             @Parameter(description = "${api.size}") @RequestParam(name = "size", defaultValue = "10") int size);

    @Operation(
            operationId = "getCountry",
            summary = "${api.getCountry.summary}",
            description = "${api.getCountry.description}",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful"),
                    @ApiResponse(responseCode = "400", description = "Failed")
            })
    @GetMapping(
            value = "/get-country",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    CountryDto getCountry(@RequestHeader Map<String, Object> headers,
                          @Parameter(description = "${api.countryCode}") @RequestParam("countryCode") String countryCode);

    @Operation(
            operationId = "getAllCities",
            summary = "${api.getAllCities.summary}",
            description = "${api.getAllCities.description}",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful"),
                    @ApiResponse(responseCode = "400", description = "Failed")
            })
    @GetMapping(
            value = "/all-cities",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    PageResponse<CityDto> getAllCities(@RequestHeader Map<String, Object> headers,
                                       @Parameter(description = "${api.page}") @RequestParam(name = "page", defaultValue = "0") int page,
                                       @Parameter(description = "${api.size}") @RequestParam(name = "size", defaultValue = "10") int size);

    @Operation(
            operationId = "getCountryCities",
            summary = "${api.getCountryCities.summary}",
            description = "${api.getCountryCities.description}",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful"),
                    @ApiResponse(responseCode = "400", description = "Failed")
            })
    @GetMapping(
            value = "/get-country-cities",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    PageResponse<CityDto> getCountryCities(@RequestHeader Map<String, Object> headers,
                                           @Parameter(description = "${api.countryCode}") @RequestParam("countryCode") String countryCode,
                                           @Parameter(description = "${api.page}") @RequestParam(name = "page", defaultValue = "0") int page,
                                           @Parameter(description = "${api.size}") @RequestParam(name = "size", defaultValue = "10") int size);

    @Operation(
            operationId = "getCity",
            summary = "${api.getCity.summary}",
            description = "${api.getCity.description}",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful"),
                    @ApiResponse(responseCode = "400", description = "Failed")
            })
    @GetMapping(
            value = "/get-city",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    CityDto getCity(@RequestHeader Map<String, Object> headers,
                    @Parameter(description = "${}") @RequestParam("cityCode") String cityCode);

    @Operation(
            operationId = "getAddress",
            summary = "${api.getAddress.summary}",
            description = "${api.getAddress.description}",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful"),
                    @ApiResponse(responseCode = "400", description = "Failed")
            })
    @GetMapping(
            value = "/get-address",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    AddressDto getAddress(@RequestHeader Map<String, Object> headers,
                          @Parameter(description = "${}") @RequestParam("postalCode") String postalCode);

    @Operation(
            operationId = "addAddress",
            summary = "${api.addAddress.summary}",
            description = "${api.addAddress.description}",
            responses = {
                    @ApiResponse(responseCode = "201", description = "address is added successfully"),
                    @ApiResponse(responseCode = "400", description = "Failed")
            })
    @PostMapping(
            value = "/add-address",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    AddAddressResponseDto addAddress(@RequestHeader Map<String, Object> headers,
                                     @RequestBody AddAddressRequestDto requestDto);

}