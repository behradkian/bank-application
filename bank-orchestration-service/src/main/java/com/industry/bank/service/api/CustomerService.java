package com.industry.bank.service.api;

import com.industry.bank.api.dto.customer.CreateCorporateCustomerRequestDto;
import com.industry.bank.api.dto.customer.CreateGeneralCustomerResponseDto;
import com.industry.bank.api.dto.customer.CreateRealCustomerRequestDto;
import com.industry.bank.api.dto.general.RequestHeader;

public interface CustomerService {
    CreateGeneralCustomerResponseDto createRealCustomer(RequestHeader<String, Object> headers, CreateRealCustomerRequestDto realCustomerRequestDto);

    CreateGeneralCustomerResponseDto createCorporateCustomer(RequestHeader<String, Object> headers, CreateCorporateCustomerRequestDto corporateCustomerRequestDto);
}
