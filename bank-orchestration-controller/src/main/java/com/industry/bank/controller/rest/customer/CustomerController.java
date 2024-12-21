package com.industry.bank.controller.rest.customer;

import com.industry.bank.api.dto.customer.CreateCorporateCustomerRequestDto;
import com.industry.bank.api.dto.customer.CreateGeneralCustomerResponseDto;
import com.industry.bank.api.dto.customer.CreateRealCustomerRequestDto;
import com.industry.bank.api.dto.general.BankOrchestrationRequestHeader;
import com.industry.bank.api.facade.customer.CustomerFacade;
import com.industry.bank.service.api.CustomerService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@Tag(name = "${Customer.Services}")
@RequestMapping(path = CustomerFacade.PATH)
public class CustomerController implements CustomerFacade {

    private final CustomerService customerService;

    @Operation(
            operationId = "createRealCustomer",
            summary = "تعریف مشتری حقیقی",
            description = "تعریف مشتری حقیقی",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful"),
                    @ApiResponse(responseCode = "400", description = "Failed")//"mdFILE"
            })
    @Override
    public CreateGeneralCustomerResponseDto createRealCustomer(BankOrchestrationRequestHeader<String, Object> headers,
                                                               CreateRealCustomerRequestDto realCustomerRequestDto) {
        return customerService.createRealCustomer(realCustomerRequestDto);
    }

    @Operation(
            operationId = "createCorporateCustomer",
            summary = "تعریف مشتری حقوقی",
            description = "تعریف مشتری حقوقی",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful"),
                    @ApiResponse(responseCode = "400", description = "Failed")//"mdFILE"
            })
    @Override
    public CreateGeneralCustomerResponseDto createCorporateCustomer(BankOrchestrationRequestHeader<String, Object> headers,
                                                                    CreateCorporateCustomerRequestDto corporateCustomerRequestDto) {
        return customerService.createCorporateCustomer(corporateCustomerRequestDto);
    }

}