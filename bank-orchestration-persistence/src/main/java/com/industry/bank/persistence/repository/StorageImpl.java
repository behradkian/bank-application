package com.industry.bank.persistence.repository;

import com.industry.bank.persistence.api.RealCustomerRepository;
import com.industry.bank.service.repository.Storage;
import com.industry.bank.service.repository.dto.RealCustomerRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class StorageImpl implements Storage {

    private final RealCustomerRepository realCustomerRepository;

    @Override
    public RealCustomerRequest getRealCustomerRequest(String customerId) {
        if(customerId == null)
            return null;
       // realCustomerRepository.findByRealCustomerId(Long.parseLong(customerId));
        return null;
    }

    @Override
    public RealCustomerRequest getRealCustomerRequestByNationalCode(String nationalCode) {
        return null;
    }

    @Override
    public RealCustomerRequest saveRealCustomerRequest(RealCustomerRequest realCustomerRequest) {
        return null;
    }

}