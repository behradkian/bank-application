package com.industry.bank.controller.rest.customer;

import com.industry.bank.api.dto.customer.CreateCorporateCustomerRequestDto;
import com.industry.bank.api.dto.customer.CreateGeneralCustomerResponseDto;
import com.industry.bank.api.dto.customer.CreateRealCustomerRequestDto;
import com.industry.bank.api.exception.checked.CustomerExistedException;
import com.industry.bank.api.facade.customer.CorporateCustomerApi;
import com.industry.bank.service.api.CustomerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@AllArgsConstructor
@RestController
@Tag(name = "${CorporateCustomer.Services}")
@RequestMapping(CorporateCustomerApi.PATH)
public class CorporateCustomerController implements CorporateCustomerApi {

    private final CustomerService customerService;

    @Override
    public CreateGeneralCustomerResponseDto createCorporateCustomer(Map<String, Object> headers, CreateCorporateCustomerRequestDto corporateCustomerRequestDto) {
        return customerService.createCorporateCustomer(corporateCustomerRequestDto);
    }

    @Override
    public CreateGeneralCustomerResponseDto getCorporateCustomer(Map<String, Object> headers, String customerNumber) {
        return null;
    }

    @Override
    public CreateGeneralCustomerResponseDto updateCorporateCustomer(Map<String, Object> headers, CreateRealCustomerRequestDto realCustomerRequestDto) throws CustomerExistedException {
        return null;
    }

    @Override
    public CreateGeneralCustomerResponseDto deleteCorporateCustomer(Map<String, Object> headers, String customerNumber) {
        return null;
    }

}