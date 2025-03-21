package com.industry.bank.api.facade.customer;

import com.industry.bank.api.dto.customer.CreateCorporateCustomerRequestDto;
import com.industry.bank.api.dto.customer.CreateGeneralCustomerResponseDto;
import com.industry.bank.api.dto.customer.CreateRealCustomerRequestDto;
import com.industry.bank.api.dto.general.BankOrchestrationRequestHeader;
import com.industry.bank.api.exception.checked.CustomerExistedException;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@FeignClient
public interface CustomerFacade {

    String PATH = "/customer";

    /**
     * @param headers                {@link BankOrchestrationRequestHeader}
     * @param realCustomerRequestDto {@link CreateRealCustomerRequestDto}
     * @return {@link CreateGeneralCustomerResponseDto}
     */
    @PostMapping(
            value = "/create-real-customer",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    CreateGeneralCustomerResponseDto createRealCustomer(@RequestHeader BankOrchestrationRequestHeader<String, Object> headers,
                                                        @RequestBody CreateRealCustomerRequestDto realCustomerRequestDto) throws CustomerExistedException;

    /**
     * @param headers                     {@link BankOrchestrationRequestHeader}
     * @param corporateCustomerRequestDto {@link CreateCorporateCustomerRequestDto}
     * @return {@link CreateGeneralCustomerResponseDto}
     */
    @PostMapping(
            value = "/create-corporate-customer",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    CreateGeneralCustomerResponseDto createCorporateCustomer(@RequestHeader BankOrchestrationRequestHeader<String, Object> headers,
                                                             @RequestBody CreateCorporateCustomerRequestDto corporateCustomerRequestDto);

}
