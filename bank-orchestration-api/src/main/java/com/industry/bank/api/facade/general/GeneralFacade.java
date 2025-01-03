package com.industry.bank.api.facade.general;

import com.industry.bank.api.dto.general.BankOrchestrationRequestHeader;
import com.industry.bank.api.dto.general.NationalityDto;
import com.industry.bank.api.dto.general.OccupationDto;
import com.industry.bank.api.dto.location.CityDto;
import com.industry.bank.api.dto.location.CountryDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@FeignClient

public interface GeneralFacade {

    String PATH = "/general";

    @GetMapping(
            value = "/nationality",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    List<NationalityDto> getNationalities(@RequestHeader BankOrchestrationRequestHeader<String, Object> headers);


    @GetMapping(
            value = "/country",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    List<CountryDto> getCountries(@RequestHeader BankOrchestrationRequestHeader<String, Object> headers);


    @GetMapping(
            value = "/city",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    List<CityDto> getCities(@RequestHeader BankOrchestrationRequestHeader<String, Object> headers);

    @GetMapping(
            value = "/occupation",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    List<OccupationDto> getOccupations(@RequestHeader BankOrchestrationRequestHeader<String, Object> headers);

}
