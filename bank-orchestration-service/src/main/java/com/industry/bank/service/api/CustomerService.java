package com.industry.bank.service.api;

import com.industry.bank.api.dto.customer.*;
import com.industry.bank.api.exception.checked.CustomerExistedException;

public interface CustomerService {

    CreateGeneralCustomerResponseDto createRealCustomer(CreateRealCustomerRequestDto realCustomerRequestDto) throws CustomerExistedException, CustomerExistedException;

    GetRealCustomerResponseDto getRealCustomer(String customerNumber);

    DeleteRealCustomerResponseDto deleteRealCustomer(String customerNumber);

    UpdateRealCustomerResponseDto updateRealCustomer(UpdateRealCustomerRequestDto updateRealCustomerRequestDto);

    CreateGeneralCustomerResponseDto createCorporateCustomer(CreateCorporateCustomerRequestDto corporateCustomerRequestDto);


}
