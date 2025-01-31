package com.industry.bank.service.adapter.general;

import com.industry.bank.api.dto.location.AddressDto;
import com.industry.bank.service.repository.dto.AddressRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Pedram Behradkian
 * @date : 2025/01/31
 */
@AllArgsConstructor
@Component
public class AddressAdapter {

    private final CityAdapter cityAdapter;

    public List<AddressRequest> adaptAddressRequestList(List<AddressDto> addresses) {

        if (addresses == null || addresses.isEmpty())
            return null;

        List<AddressRequest> addressRequests = new ArrayList<>();

        for (AddressDto addressDto : addresses)
            if (addressDto != null)
                addressRequests.add(adaptAddressRequest(addressDto));

        return addressRequests;
    }

    public AddressRequest adaptAddressRequest(AddressDto addressDto) {
        if (addressDto == null || addressDto.getAddressDetails() == null)
            return null;
        return AddressRequest.builder()
                .addressType(addressDto.getAddressType())
                .postalCode(addressDto.getAddressDetails().getPostalCode())
                .city(cityAdapter.adaptCityRequest(addressDto.getCity()))
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

}