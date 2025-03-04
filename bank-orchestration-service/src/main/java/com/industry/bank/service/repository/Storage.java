package com.industry.bank.service.repository;

import com.industry.bank.service.repository.dto.RealCustomerRequest;

public interface Storage {

    //RealCustomer
    RealCustomerRequest getRealCustomerRequest(String customerId);
    RealCustomerRequest getRealCustomerRequestByNationalCode(String nationalCode);
    RealCustomerRequest saveRealCustomerRequest(RealCustomerRequest realCustomerRequest);

}