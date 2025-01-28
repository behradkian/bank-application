package com.industry.bank.service;

import com.industry.bank.api.dto.customer.*;
import com.industry.bank.api.exception.checked.CustomerExistedException;
import com.industry.bank.api.exception.runtime.NotImplementedException;
import com.industry.bank.service.api.CustomerService;
import com.industry.bank.service.repository.CustomerStorage;
import com.industry.bank.service.repository.dto.RealCustomerRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerStorage customerStorage;

    @Transactional
    @Override
    public CreateRealCustomerResponseDto createRealCustomer(CreateRealCustomerRequestDto requestDto) throws CustomerExistedException {

        RealCustomerRequest realCustomerRequest = customerStorage.getRealCustomerRequestByNationalCode(requestDto.getNationalCode());

        if(realCustomerRequest != null) {
            throw new CustomerExistedException(String.format("customer existed with nationalCode : %s", realCustomerRequest.getNationalCode()));
        }

        return null;
    }

    @Override
    public CreateCorporateCustomerResponseDto createCorporateCustomer(CreateCorporateCustomerRequestDto requestDto) {
        throw new NotImplementedException();
    }

    private void validateRealCustomerRequestDto(CreateRealCustomerRequestDto requestDto) {


    }

}
