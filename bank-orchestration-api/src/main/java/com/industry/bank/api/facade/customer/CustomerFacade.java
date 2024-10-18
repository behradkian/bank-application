package com.industry.bank.api.facade.customer;

import com.industry.bank.api.dto.customer.CreateCorporateCustomerRequestDto;
import com.industry.bank.api.dto.customer.CreateGeneralCustomerResponseDto;
import com.industry.bank.api.dto.customer.CreateRealCustomerRequestDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseStatus;


public interface CustomerFacade {

    String PATH = "/customer";

    @PostMapping(
            value = "/create-real-customer",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @Operation(
            operationId = "createRealCustomer", summary = "تعریف مشتری حقیقی", description = "تعریف مشتری حقیقی", responses = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "NOK")//"mdFILE"
    })
    CreateGeneralCustomerResponseDto createRealCustomer(@RequestHeader com.industry.bank.api.dto.general.RequestHeader<String , Object> headers, @RequestBody CreateRealCustomerRequestDto realCustomerRequestDto);

    @PostMapping(
            value = "/create-corporate-customer",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @Operation(operationId = "createCorporateCustomer", summary = "تعریف مشتری حقوقی", description = "تعریف مشتری حقوقی", responses = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "NOK")//"mdFILE"
    })
    CreateGeneralCustomerResponseDto createCorporateCustomer(@RequestHeader com.industry.bank.api.dto.general.RequestHeader<String , Object> headers, @RequestBody CreateCorporateCustomerRequestDto corporateCustomerRequestDto);

}
