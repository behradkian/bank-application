package com.industry.bank.api.facade.customer;

import com.industry.bank.api.dto.customer.CreateGeneralCustomerResponseDto;
import com.industry.bank.api.dto.customer.CreateRealCustomerRequestDto;
import com.industry.bank.api.dto.general.BankOrchestrationRequestHeader;
import com.industry.bank.api.exception.checked.CustomerExistedException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@FeignClient
public interface RealCustomerApi {

    String PATH = "/customer/real";

    /**
     * @param headers                {@link BankOrchestrationRequestHeader}
     * @param realCustomerRequestDto {@link CreateRealCustomerRequestDto}
     * @return {@link CreateGeneralCustomerResponseDto}
     */
    @Operation(
            operationId = "createRealCustomer",
            summary = "تعریف مشتری حقیقی",
            description = "تعریف مشتری حقیقی",
            responses = {
                    @ApiResponse(responseCode = "201", description = "Successful"),
                    @ApiResponse(responseCode = "400", description = "Failed")//"mdFILE"
            })
    @PostMapping(
            value = "/create-customer",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    CreateGeneralCustomerResponseDto createRealCustomer(@RequestHeader BankOrchestrationRequestHeader<String, Object> headers,
                                                        @RequestBody CreateRealCustomerRequestDto realCustomerRequestDto) throws CustomerExistedException;


    /**
     * @param headers        {@link BankOrchestrationRequestHeader}
     * @param customerNumber {@link String}
     * @return {@link CreateGeneralCustomerResponseDto}
     */
    @Operation(
            operationId = "getCorporateCustomer",
            summary = "دریافت اطلاعات مشتری",
            description = "دریافت اطلاعات مشتری",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful"),
                    @ApiResponse(responseCode = "400", description = "Failed")//"mdFILE"
            })
    @GetMapping(
            value = "/get-customer",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    CreateGeneralCustomerResponseDto getRealCustomer(@RequestHeader BankOrchestrationRequestHeader<String, Object> headers,
                                                     @RequestParam String customerNumber);

    /**
     * @param headers                {@link BankOrchestrationRequestHeader}
     * @param realCustomerRequestDto {@link CreateRealCustomerRequestDto}
     * @return {@link CreateGeneralCustomerResponseDto}
     */
    @Operation(
            operationId = "getCorporateCustomer",
            summary = "اصلاح اطلاعات مشتری",
            description = "اصلاح اطلاعات مشتری",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful"),
                    @ApiResponse(responseCode = "400", description = "Failed")//"mdFILE"
            })
    @PutMapping(
            value = "/update-customer",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    CreateGeneralCustomerResponseDto updateRealCustomer(@RequestHeader BankOrchestrationRequestHeader<String, Object> headers,
                                                        @RequestBody CreateRealCustomerRequestDto realCustomerRequestDto) throws CustomerExistedException;

    /**
     * @param headers        {@link BankOrchestrationRequestHeader}
     * @param customerNumber {@link String}
     * @return {@link CreateGeneralCustomerResponseDto}
     */
    @Operation(
            operationId = "getCorporateCustomer",
            summary = "حذف مشتری",
            description = "حذف مشتری",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful"),
                    @ApiResponse(responseCode = "400", description = "Failed")//"mdFILE"
            })
    @DeleteMapping(
            value = "/delete-customer",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    CreateGeneralCustomerResponseDto deleteRealCustomer(@RequestHeader BankOrchestrationRequestHeader<String, Object> headers,
                                                        @RequestParam String customerNumber);

}