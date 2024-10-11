package com.industry.bank.api.facade;

import com.industry.bank.api.dto.customer.CreateCorporateCustomerRequestDto;
import com.industry.bank.api.dto.customer.CreateGeneralCustomerResponseDto;
import com.industry.bank.api.dto.customer.CreateRealCustomerRequestDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Map;

public interface CustomerFacade {

    String PATH = "/v1/customer";

    @PostMapping(
            value = "/create-real-customer",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    CreateGeneralCustomerResponseDto createRealCustomer(@RequestHeader Map<String, Object> headers, @RequestBody CreateRealCustomerRequestDto realCustomerRequestDto);

    @PostMapping(
            value = "/create-corporate-customer",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    CreateGeneralCustomerResponseDto createCorporateCustomer(@RequestHeader Map<String, Object> headers, @RequestBody CreateCorporateCustomerRequestDto corporateCustomerRequestDto);

}
