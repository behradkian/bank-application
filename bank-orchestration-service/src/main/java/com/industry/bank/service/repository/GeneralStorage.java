package com.industry.bank.service.repository;

import com.industry.bank.service.repository.dto.NationalityRequest;

public interface GeneralStorage {

    NationalityRequest getNationalityByCode(String code);

}
