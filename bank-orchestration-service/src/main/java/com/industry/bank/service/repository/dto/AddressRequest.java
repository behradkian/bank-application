package com.industry.bank.service.repository.dto;

import com.industry.bank.api.enumeration.general.AddressType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressRequest {

    private String addressId;
    private CityRequest city;
    private AddressType addressType;
    private String postalCode;
    private String province;
    private String townShip;
    private String zone;
    private String firstStreet;
    private String secondStreet;
    private String houseNumber;
    private String floorNumber;
    private String sideFloor;

}