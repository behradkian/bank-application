package com.industry.bank.api.dto.general.location;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDetailsDto {

    private String postalCode;
    private String province;
    private String townShip;
    private String village;
    private String city;
    private String localityType;
    private String localityName;
    private String localityCode;
    private String subLocality;
    private String zone;
    private String firstStreet;
    private String secondStreet;
    private String buildingName;
    private String floorNumber;
    private String sideFloor;
    private String houseNumber;
    private String totalAddress;
}
