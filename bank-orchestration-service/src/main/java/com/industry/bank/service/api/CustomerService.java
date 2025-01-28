package com.industry.bank.service.api;

import com.industry.bank.api.dto.customer.CreateCorporateCustomerRequestDto;
import com.industry.bank.api.dto.customer.CreateGeneralCustomerResponseDto;
import com.industry.bank.api.dto.customer.CreateRealCustomerRequestDto;
import com.industry.bank.api.exception.checked.CustomerExistedException;

public interface CustomerService {

    CreateGeneralCustomerResponseDto createRealCustomer(CreateRealCustomerRequestDto realCustomerRequestDto) throws CustomerExistedException, CustomerExistedException;

    CreateGeneralCustomerResponseDto createCorporateCustomer(CreateCorporateCustomerRequestDto corporateCustomerRequestDto);
}
