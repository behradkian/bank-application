package com.industry.bank.service.adapter;

import com.industry.bank.api.dto.customer.CreateRealCustomerRequestDto;
import com.industry.bank.api.dto.customer.CreateRealCustomerResponseDto;
import com.industry.bank.api.dto.general.OccupationDto;
import com.industry.bank.api.enumeration.customer.DegreeType;
import com.industry.bank.service.repository.dto.DegreeRequest;
import com.industry.bank.service.repository.dto.OccupationRequest;
import com.industry.bank.service.repository.dto.RealCustomerRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author : Pedram Behradkian
 * @date : 2025/01/31
 */
@AllArgsConstructor
@Component
public class CustomerAdapter {

    private final GeneralAdapter generalAdapter;

    public RealCustomerRequest adaptRealCustomerRequest(CreateRealCustomerRequestDto requestDto) {
        return RealCustomerRequest.builder()
                .nationalCode(requestDto.getNationalityCode())
                .firstName(requestDto.getFirstName())
                .lastName(requestDto.getLastName())
                .birthdate(requestDto.getBirthdate())
                .mobileNumber(requestDto.getMobileNumber())
                .email(requestDto.getEmail())
                .gender(requestDto.getGender())
                .nationality(generalAdapter.adaptNationalityRequest(requestDto.getNationality()))
                .degree(adaptDegreeRequest(requestDto.getDegree()))
                .addresses(generalAdapter.adaptAddressRequestList(requestDto.getAddresses()))
                .occupation(adaptOccupationRequest(requestDto.getOccupation()))
                .build();
    }

    public CreateRealCustomerResponseDto adaptRealCustomerResponse(RealCustomerRequest realCustomerRequest) {
        var createRealCustomerResponseDto = new CreateRealCustomerResponseDto();
        createRealCustomerResponseDto.setCustomerNumber(realCustomerRequest.getCustomerNumber());
        return createRealCustomerResponseDto;
    }

    public OccupationRequest adaptOccupationRequest(OccupationDto occupation) {
        if (occupation == null)
            return null;
        return OccupationRequest.builder()
                .occupationCode(occupation.getCode())
                .occupationName(occupation.getValue())
                .build();
    }

    public DegreeRequest adaptDegreeRequest(DegreeType degreeType) {
        if (degreeType == null)
            return null;
        return DegreeRequest.builder()
                .degreeCode(String.valueOf(degreeType.getCode()))
                .degreeCode(degreeType.getValue())
                .build();
    }

}
