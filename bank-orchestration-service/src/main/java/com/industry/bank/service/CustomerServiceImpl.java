package com.industry.bank.service;

import com.industry.bank.api.dto.customer.*;
import com.industry.bank.api.exception.runtime.NotImplementedException;
import com.industry.bank.service.api.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    @Transactional
    @Override
    public CreateRealCustomerResponseDto createRealCustomer(CreateRealCustomerRequestDto requestDto) {

        return null;
    }

    @Override
    public CreateCorporateCustomerResponseDto createCorporateCustomer(CreateCorporateCustomerRequestDto requestDto) {
        throw new NotImplementedException();
    }

    private void validateRealCustomerRequestDto(CreateRealCustomerRequestDto requestDto) {


    }

}
