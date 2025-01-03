package com.industry.bank.controller.rest.general;

import com.industry.bank.api.dto.general.BankOrchestrationRequestHeader;
import com.industry.bank.api.dto.general.NationalityDto;
import com.industry.bank.api.dto.general.OccupationDto;
import com.industry.bank.api.dto.location.CityDto;
import com.industry.bank.api.dto.location.CountryDto;
import com.industry.bank.api.facade.general.GeneralFacade;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Tag(name = "general services")
@RequestMapping(path = GeneralFacade.PATH)
public class GeneralController implements GeneralFacade {

    @Override
    public List<NationalityDto> getNationalities(BankOrchestrationRequestHeader<String, Object> headers) {
        return null;
    }

    @Override
    public List<CountryDto> getCountries(BankOrchestrationRequestHeader<String, Object> headers) {
        return null;
    }

    @Override
    public List<CityDto> getCities(BankOrchestrationRequestHeader<String, Object> headers) {
        return null;
    }

    @Override
    public List<OccupationDto> getOccupations(BankOrchestrationRequestHeader<String, Object> headers) {
        return List.of();
    }

}