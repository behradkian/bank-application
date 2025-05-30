package com.industry.bank.controller.rest.customer;

import com.industry.bank.api.dto.customer.CreateGeneralCustomerResponseDto;
import com.industry.bank.api.dto.customer.CreateRealCustomerRequestDto;
import com.industry.bank.api.dto.general.BankOrchestrationRequestHeader;
import com.industry.bank.api.exception.checked.CustomerExistedException;
import com.industry.bank.api.facade.customer.RealCustomerApi;
import com.industry.bank.service.api.CustomerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@Tag(name = "${RealCustomer.Services}")
@RequestMapping(path = RealCustomerApi.PATH)
public class RealCustomerController implements RealCustomerApi {

    private final CustomerService customerService;

    @Override
    public CreateGeneralCustomerResponseDto createRealCustomer(BankOrchestrationRequestHeader<String, Object> headers, CreateRealCustomerRequestDto realCustomerRequestDto) throws CustomerExistedException {
        return customerService.createRealCustomer(realCustomerRequestDto);
    }

    @Override
    public CreateGeneralCustomerResponseDto getRealCustomer(BankOrchestrationRequestHeader<String, Object> headers, String customerNumber) {
        return null;
    }

    @Override
    public CreateGeneralCustomerResponseDto updateRealCustomer(BankOrchestrationRequestHeader<String, Object> headers, CreateRealCustomerRequestDto realCustomerRequestDto) {
        return null;
    }

    @Override
    public CreateGeneralCustomerResponseDto deleteRealCustomer(BankOrchestrationRequestHeader<String, Object> headers, String customerNumber) {
        return null;
    }

}