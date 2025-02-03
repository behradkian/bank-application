package com.industry.bank.persistence.repository;

import com.industry.bank.service.repository.GeneralStorage;
import com.industry.bank.service.repository.dto.NationalityRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class GeneralStorageImpl implements GeneralStorage {

    @Override
    public NationalityRequest getNationalityByCode(String code) {
        return null;
    }
}
