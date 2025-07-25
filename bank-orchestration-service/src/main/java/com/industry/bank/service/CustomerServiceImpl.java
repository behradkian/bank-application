package com.industry.bank.service;

import com.industry.bank.api.dto.customer.*;
import com.industry.bank.api.exception.checked.CustomerExistedException;
import com.industry.bank.api.exception.runtime.NotImplementedException;
import com.industry.bank.service.adapter.CustomerAdapter;
import com.industry.bank.service.api.CustomerService;
import com.industry.bank.service.repository.Storage;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final Storage storage;
    private final CustomerAdapter customerAdapter;

    @Override
    @Transactional
    public CreateRealCustomerResponseDto createRealCustomer(CreateRealCustomerRequestDto requestDto) throws CustomerExistedException {
        var realCustomerRequest = storage.getRealCustomerRequestByNationalCode(requestDto.getNationalityCode());
        if (realCustomerRequest != null) {
            String message = String.format("customer existed with nationalCode : %s, with customerNumber : %s", realCustomerRequest.getNationalCode(), realCustomerRequest.getCustomerNumber());
            log.error(message);
            throw new CustomerExistedException(message);
        }
        var newCustomerRequest = customerAdapter.adaptCreateRealCustomerRequest(requestDto);
        var newRealCustomerRequest = storage.saveRealCustomerRequest(newCustomerRequest);
        return customerAdapter.adaptCreateRealCustomerResponse(newRealCustomerRequest);
    }

    @Override
    public CreateCorporateCustomerResponseDto createCorporateCustomer(CreateCorporateCustomerRequestDto requestDto) {
        throw new NotImplementedException();
    }

    @Override
    public GetRealCustomerResponseDto getRealCustomer(String customerNumber) {
        return null;
    }

    @Override
    public DeleteRealCustomerResponseDto deleteRealCustomer(String customerNumber) {
        return null;
    }

    @Override
    public UpdateRealCustomerResponseDto updateRealCustomer(UpdateRealCustomerRequestDto updateRealCustomerRequestDto) {
        return null;
    }

}