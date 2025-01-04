package com.industry.bank.service;

import com.industry.bank.api.dto.customer.*;
import com.industry.bank.service.api.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CreateRealCustomerResponseDto createRealCustomer(CreateRealCustomerRequestDto realCustomerRequestDto) {

        return null;
    }


    @Override
    public CreateCorporateCustomerResponseDto createCorporateCustomer(CreateCorporateCustomerRequestDto corporateCustomerRequestDto) {
        return null;
    }

}
