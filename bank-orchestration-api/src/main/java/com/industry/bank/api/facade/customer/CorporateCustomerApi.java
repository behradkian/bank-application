package com.industry.bank.api.facade.customer;

import com.industry.bank.api.dto.customer.CreateCorporateCustomerRequestDto;
import com.industry.bank.api.dto.customer.CreateGeneralCustomerResponseDto;
import com.industry.bank.api.dto.customer.CreateRealCustomerRequestDto;
import com.industry.bank.api.exception.checked.CustomerExistedException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@FeignClient
public interface CorporateCustomerApi {

    String PATH = "/customer/corporate";

    /**
     * @param headers                     {@link Map}
     * @param corporateCustomerRequestDto {@link CreateCorporateCustomerRequestDto}
     * @return {@link CreateGeneralCustomerResponseDto}
     */
    @Operation(
            operationId = "createCorporateCustomer",
            summary = "تعریف مشتری حقوقی",
            description = "تعریف مشتری حقوقی",
            responses = {
                    @ApiResponse(responseCode = "201", description = "Successful"),
                    @ApiResponse(responseCode = "400", description = "Failed")//"mdFILE"
            })
    @PostMapping(
            value = "/create-customer",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    CreateGeneralCustomerResponseDto createCorporateCustomer(@RequestHeader Map<String, Object> headers,
                                                             @RequestBody CreateCorporateCustomerRequestDto corporateCustomerRequestDto);


    /**
     * @param headers        {@link Map}
     * @param customerNumber {@link String}
     * @return {@link CreateGeneralCustomerResponseDto}
     */
    @Operation(
            operationId = "getCorporateCustomer",
            summary = "دریافت اطلاعات مشتری حقوقی",
            description = "دریافت اطلاعات مشتری حقوقی",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful"),
                    @ApiResponse(responseCode = "400", description = "Failed")//"mdFILE"
            })
    @GetMapping(
            value = "/get-customer",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    CreateGeneralCustomerResponseDto getCorporateCustomer(@RequestHeader Map<String, Object> headers,
                                                          @RequestParam String customerNumber);

    /**
     * @param headers                {@link Map}
     * @param realCustomerRequestDto {@link CreateRealCustomerRequestDto}
     * @return {@link CreateGeneralCustomerResponseDto}
     */
    @Operation(
            operationId = "getCorporateCustomer",
            summary = "اصلاح اطلاعات مشتری حقوقی",
            description = "اصلاح اطلاعات مشتری حقوقی",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful"),
                    @ApiResponse(responseCode = "400", description = "Failed")//"mdFILE"
            })
    @PutMapping(
            value = "/update-customer",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    CreateGeneralCustomerResponseDto updateCorporateCustomer(@RequestHeader Map<String, Object> headers,
                                                             @RequestBody CreateRealCustomerRequestDto realCustomerRequestDto) throws CustomerExistedException;

    /**
     * @param headers        {@link Map}
     * @param customerNumber {@link String}
     * @return {@link CreateGeneralCustomerResponseDto}
     */
    @Operation(
            operationId = "getCorporateCustomer",
            summary = "حذف مشتری حقوقی",
            description = "حذف مشتری حقوقی",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful"),
                    @ApiResponse(responseCode = "400", description = "Failed")//"mdFILE"
            })
    @DeleteMapping(
            value = "/delete-customer",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    CreateGeneralCustomerResponseDto deleteCorporateCustomer(@RequestHeader Map<String, Object> headers,
                                                             @RequestParam String customerNumber);

}
