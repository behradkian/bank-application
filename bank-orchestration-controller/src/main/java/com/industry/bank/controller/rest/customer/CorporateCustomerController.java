package com.industry.bank.controller.rest.customer;

import com.industry.bank.api.dto.customer.CreateCorporateCustomerRequestDto;
import com.industry.bank.api.dto.customer.CreateGeneralCustomerResponseDto;
import com.industry.bank.api.dto.customer.CreateRealCustomerRequestDto;
import com.industry.bank.api.dto.general.BankOrchestrationRequestHeader;
import com.industry.bank.api.exception.checked.CustomerExistedException;
import com.industry.bank.api.facade.customer.CorporateCustomerFacade;
import com.industry.bank.api.facade.customer.RealCustomerFacade;
import com.industry.bank.service.api.CustomerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@Tag(name = "سرویس های مشتری حقوقی")
@RequestMapping(CorporateCustomerFacade.PATH)
public class CorporateCustomerController implements CorporateCustomerFacade {

    private final CustomerService customerService;

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

    @Override
    public CreateGeneralCustomerResponseDto getCorporateCustomer(BankOrchestrationRequestHeader<String, Object> headers, String customerNumber) {
        return null;
    }

    @Override
    public CreateGeneralCustomerResponseDto updateCorporateCustomer(BankOrchestrationRequestHeader<String, Object> headers, CreateRealCustomerRequestDto realCustomerRequestDto) throws CustomerExistedException {
        return null;
    }

    @Override
    public CreateGeneralCustomerResponseDto deleteCorporateCustomer(BankOrchestrationRequestHeader<String, Object> headers, String customerNumber) {
        return null;
    }

}