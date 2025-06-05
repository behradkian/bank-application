package com.industry.bank.api.facade.customer;

import com.industry.bank.api.dto.customer.*;
import com.industry.bank.api.dto.general.BankRequestHeader;
import com.industry.bank.api.dto.general.OccupationDto;
import com.industry.bank.api.exception.checked.CustomerExistedException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient
public interface RealCustomerApi {

    String PATH = "/customer/real";

    /**
     * @param headers                {@link BankRequestHeader}
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
    CreateGeneralCustomerResponseDto createRealCustomer(@RequestHeader BankRequestHeader<String, Object> headers,
                                                        @RequestBody CreateRealCustomerRequestDto realCustomerRequestDto) throws CustomerExistedException;


    /**
     * @param headers        {@link BankRequestHeader}
     * @param customerNumber {@link String}
     * @return {@link GetRealCustomerResponseDto}
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
    GetRealCustomerResponseDto getRealCustomer(@RequestHeader BankRequestHeader<String, Object> headers,
                                               @RequestParam String customerNumber);

    /**
     * @param headers    {@link BankRequestHeader}
     * @param requestDto {@link UpdateRealCustomerRequestDto}
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
    UpdateRealCustomerResponseDto updateRealCustomer(@RequestHeader BankRequestHeader<String, Object> headers,
                                                     @RequestBody UpdateRealCustomerRequestDto requestDto) throws CustomerExistedException;

    /**
     * @param headers        {@link BankRequestHeader}
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
    DeleteRealCustomerResponseDto deleteRealCustomer(@RequestHeader BankRequestHeader<String, Object> headers,
                                                     @RequestParam String customerNumber);

    @Operation(
            operationId = "getOccupation",
            summary = "دریافت اطلاعات شغل",
            description = "دریافت اطلاعات شغل",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful"),
                    @ApiResponse(responseCode = "400", description = "Failed")//"mdFILE"
            })
    @GetMapping(
            value = "/all-occupations",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    List<OccupationDto> getAllOccupations(@RequestHeader Map<String, Object> headers);

    @Operation(
            operationId = "getOccupation",
            summary = "دریافت اطلاعات شغل",
            description = "دریافت اطلاعات شغل",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful"),
                    @ApiResponse(responseCode = "400", description = "Failed")//"mdFILE"
            })
    @GetMapping(
            value = "/get-occupation",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    OccupationDto getOccupation(@RequestHeader Map<String, Object> headers,
                                @Parameter(description = "کد شغل") @RequestParam("occupationCode") String occupationCode);

}