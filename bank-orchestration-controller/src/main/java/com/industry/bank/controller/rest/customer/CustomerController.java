package com.industry.bank.controller.rest.customer;

import com.industry.bank.api.dto.customer.CreateCorporateCustomerRequestDto;
import com.industry.bank.api.dto.customer.CreateGeneralCustomerResponseDto;
import com.industry.bank.api.dto.customer.CreateRealCustomerRequestDto;
import com.industry.bank.api.dto.general.RequestHeader;
import com.industry.bank.api.facade.customer.CustomerFacade;
import com.industry.bank.service.api.CustomerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Tag(name = "customer services")
@RequestMapping(path = CustomerFacade.PATH)
public class CustomerController implements CustomerFacade {

    private final CustomerService customerService;

    @Override
    public CreateGeneralCustomerResponseDto createRealCustomer(RequestHeader<String, Object> headers, CreateRealCustomerRequestDto realCustomerRequestDto) {
        return customerService.createRealCustomer(headers, realCustomerRequestDto);
    }

    @Override
    public CreateGeneralCustomerResponseDto createCorporateCustomer(RequestHeader<String, Object> headers, CreateCorporateCustomerRequestDto corporateCustomerRequestDto) {
        return customerService.createCorporateCustomer(headers, corporateCustomerRequestDto);
    }


}
