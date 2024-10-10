package com.industry.bank.api.facade;

import com.industry.bank.api.dto.customer.CreateCorporateCustomerRequestDto;
import com.industry.bank.api.dto.customer.CreateGeneralCustomerResponseDto;
import com.industry.bank.api.dto.customer.CreateRealCustomerRequestDto;

public interface CustomerFacade {
    CreateGeneralCustomerResponseDto createRealCustomer(CreateRealCustomerRequestDto realCustomerRequestDto);
    CreateGeneralCustomerResponseDto createCorporateCustomer(CreateCorporateCustomerRequestDto corporateCustomerRequestDto);
}
