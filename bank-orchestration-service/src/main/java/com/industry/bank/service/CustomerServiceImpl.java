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

    @Override
    @Transactional
    public CreateRealCustomerResponseDto createRealCustomer(CreateRealCustomerRequestDto requestDto) throws CustomerExistedException {

        validateRealCustomerRequestDto(requestDto);
        RealCustomerRequest realCustomerRequest = customerStorage.getRealCustomerRequestByNationalCode(requestDto.getNationalCode());
        if (realCustomerRequest != null) {
            String message = String.format("customer existed with nationalCode : %s, with customerNumber : %s", realCustomerRequest.getNationalCode(), realCustomerRequest.getCustomerNumber());
            log.error(message);
            throw new CustomerExistedException(message);
        }
        realCustomerRequest = customerStorage.saveRealCustomerRequest(getRealCustomerRequest(requestDto));
        return getRealCustomerResponse(realCustomerRequest);
    }

    @Override
    public CreateCorporateCustomerResponseDto createCorporateCustomer(CreateCorporateCustomerRequestDto requestDto) {
        throw new NotImplementedException();
    }

    private RealCustomerRequest getRealCustomerRequest(CreateRealCustomerRequestDto requestDto) {
        return RealCustomerRequest.builder()
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
    }

    private CreateRealCustomerResponseDto getRealCustomerResponse(RealCustomerRequest realCustomerRequest) {
        CreateRealCustomerResponseDto createRealCustomerResponseDto = new CreateRealCustomerResponseDto();
        createRealCustomerResponseDto.setCustomerNumber(realCustomerRequest.getCustomerNumber());
        createRealCustomerResponseDto.setCustomerRegisterDate(realCustomerRequest.getCustomerRegisterDate());
        return createRealCustomerResponseDto;
    }

    private List<AddressRequest> getAddressRequestList(List<AddressDto> addresses) {

        if (addresses == null || addresses.isEmpty())
            return null;

        List<AddressRequest> addressRequests = new ArrayList<>();

        for (AddressDto addressDto : addresses)
            if (addressDto != null)
                addressRequests.add(getAddressRequest(addressDto));

        return addressRequests;
    }

    private AddressRequest getAddressRequest(AddressDto addressDto) {
        if (addressDto == null || addressDto.getAddressDetails() == null)
            return null;
        return AddressRequest.builder()
                .addressType(addressDto.getAddressType())
                .postalCode(addressDto.getAddressDetails().getPostalCode())
                .city(getCityRequest(addressDto.getCity()))
                .province(addressDto.getAddressDetails().getProvince())
                .townShip(addressDto.getAddressDetails().getTownShip())
                .zone(addressDto.getAddressDetails().getZone())
                .firstStreet(addressDto.getAddressDetails().getFirstStreet())
                .secondStreet(addressDto.getAddressDetails().getSecondStreet())
                .houseNumber(addressDto.getAddressDetails().getHouseNumber())
                .floorNumber(addressDto.getAddressDetails().getFloorNumber())
                .sideFloor(addressDto.getAddressDetails().getSideFloor())
                .build();
    }

    private OccupationRequest getOccupationRequest(OccupationDto occupation) {
        return null;
    }

    private DegreeRequest getDegreeRequest(DegreeType degreeType) {
        return null;
    }

    private CityRequest getCityRequest(CityDto city) {
        return null;
    }

    private void validateRealCustomerRequestDto(CreateRealCustomerRequestDto createRealCustomerRequestDto) {

    }

}