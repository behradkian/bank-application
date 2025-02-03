package com.industry.bank.service.adapter.general;

import com.industry.bank.api.dto.general.NationalityDto;
import com.industry.bank.service.repository.GeneralStorage;
import com.industry.bank.service.repository.dto.NationalityRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author : Pedram Behradkian
 * @date : 2025/01/31
 */
@AllArgsConstructor
@Component
public class NationalityAdaptor {

    private final GeneralStorage generalStorage;

    public NationalityDto adaptNationalityDto(NationalityRequest nationalityRequest) {
        NationalityDto nationalityDto = new NationalityDto();
        nationalityDto.setCode(nationalityRequest.getNationalityCode());
        nationalityDto.setName(nationalityRequest.getNationalityName());
        return nationalityDto;
    }

    public NationalityRequest adaptNationalityRequest(NationalityDto nationalityDto) {
        return generalStorage.getNationalityByCode(nationalityDto.getCode());
    }

}
