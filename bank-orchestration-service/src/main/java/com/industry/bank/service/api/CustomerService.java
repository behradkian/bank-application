package com.industry.bank.service.api;

import com.industry.bank.api.dto.customer.CreateCorporateCustomerRequestDto;
import com.industry.bank.api.dto.customer.CreateGeneralCustomerResponseDto;
import com.industry.bank.api.dto.customer.CreateRealCustomerRequestDto;

public interface CustomerService {

    CreateGeneralCustomerResponseDto createRealCustomer(CreateRealCustomerRequestDto realCustomerRequestDto);

    CreateGeneralCustomerResponseDto createCorporateCustomer(CreateCorporateCustomerRequestDto corporateCustomerRequestDto);
}
