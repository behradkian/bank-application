package com.industry.bank.controller.rest.customer;

import com.industry.bank.api.dto.customer.CreateCorporateCustomerRequestDto;
import com.industry.bank.api.dto.customer.CreateGeneralCustomerResponseDto;
import com.industry.bank.api.dto.customer.CreateRealCustomerRequestDto;
import com.industry.bank.api.dto.general.RequestHeader;
import com.industry.bank.api.facade.CustomerFacade;
import com.industry.bank.service.api.CustomerService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping(path = CustomerFacade.PATH)
public class CustomerController implements CustomerFacade {

    private final CustomerService customerService;

    @Override
    @Operation(operationId = "createRealCustomer", summary = "تعریف مشتری حقیقی")
    public CreateGeneralCustomerResponseDto createRealCustomer(RequestHeader<String, Object> headers, CreateRealCustomerRequestDto realCustomerRequestDto) {
        return customerService.createRealCustomer(headers , realCustomerRequestDto);
    }

    @Override
    @Operation(operationId = "createCorporateCustomer", summary = "تعریف مشتری حقوقی")
    public CreateGeneralCustomerResponseDto createCorporateCustomer(RequestHeader<String, Object> headers, CreateCorporateCustomerRequestDto corporateCustomerRequestDto) {
        return customerService.createCorporateCustomer(headers , corporateCustomerRequestDto);
    }


}
