package com.industry.bank.service;

import com.industry.bank.api.dto.customer.*;
import com.industry.bank.api.dto.general.OccupationDto;
import com.industry.bank.api.dto.location.AddressDto;
import com.industry.bank.api.dto.location.CityDto;
import com.industry.bank.api.enumeration.customer.DegreeType;
import com.industry.bank.api.exception.checked.CustomerExistedException;
import com.industry.bank.api.exception.runtime.NotImplementedException;
import com.industry.bank.service.api.CustomerService;
import com.industry.bank.service.repository.CustomerStorage;
import com.industry.bank.service.repository.dto.*;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerStorage customerStorage;

    @Transactional
    @Override
    public CreateRealCustomerResponseDto createRealCustomer(CreateRealCustomerRequestDto requestDto) throws CustomerExistedException {

        RealCustomerRequest realCustomerRequest = customerStorage.getRealCustomerRequestByNationalCode(requestDto.getNationalCode());

        final String message;

        if (realCustomerRequest != null) {
            message = String.format("customer existed with nationalCode : %s, with customerNumber : %s", realCustomerRequest.getNationalCode(), null);
            log.error(message);
            throw new CustomerExistedException(message);
        }

        realCustomerRequest = RealCustomerRequest.builder()
                .nationalCode(requestDto.getNationalCode())
                .firstName(requestDto.getFirstName())
                .lastName(requestDto.getLastName())
                .birthdate(requestDto.getBirthdate())
                .mobileNumber(requestDto.getMobileNumber())
                .email(requestDto.getEmail())
                .gender(requestDto.getGender())
                .degree(getDegreeRequest(requestDto.getDegree()))
                .addresses(getAddressRequestList(requestDto.getAddresses()))
                .occupation(getOccupationRequest(requestDto.getOccupation()))
                .build();

        customerStorage.saveRealCustomerRequest(realCustomerRequest);
        return null;
    }

    @Override
    public CreateCorporateCustomerResponseDto createCorporateCustomer(CreateCorporateCustomerRequestDto requestDto) {
        throw new NotImplementedException();
    }

    private List<AddressRequest> getAddressRequestList(List<AddressDto> addresses){

        if(addresses == null || addresses.isEmpty()){

        }

        List<AddressRequest> addressRequests = new ArrayList<>();
        for(AddressDto addressDto : addresses){

        }

        return null;
    }

    private OccupationRequest getOccupationRequest(OccupationDto occupation){
        return null;
    }

    private DegreeRequest getDegreeRequest(DegreeType degreeType){
        return null;
    }

    private CityRequest getCityRequest(CityDto city){
        return null;
    }

    private AddressRequest getAddressRequest(AddressDto addressDto){
        return AddressRequest.builder()
//                .addressType(addressDto.getAddressType())
//                .postalCode(addressDto.getAddressDetails().getPostalCode())
//                .city(getCityRequest(addressDto.getCity()))
//                .province()
//                .townShip()
//                .zone()
//                .firstStreet()
//                .secondStreet()
//                .houseNumber()
//                .floorNumber()
//                .sideFloor()
                .build();
    }

}