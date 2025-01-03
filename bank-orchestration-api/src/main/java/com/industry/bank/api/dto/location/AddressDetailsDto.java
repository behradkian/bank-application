package com.industry.bank.api.dto.location;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "AddressDetailsDto")
public class AddressDetailsDto {

    @Schema(name = "postalCode")
    private String postalCode;

    @Schema(name = "province")
    private String province;

    @Schema(name = "townShip")
    private String townShip;

    @Schema(name = "village")
    private String village;

    @Schema(name = "city")
    private String city;

    @Schema(name = "localityType")
    private String localityType;

    @Schema(name = "localityName")
    private String localityName;

    @Schema(name = "localityCode")
    private String localityCode;

    @Schema(name = "zone")
    private String zone;

    @Schema(name = "firstStreet")
    private String firstStreet;

    @Schema(name = "secondStreet")
    private String secondStreet;

    @Schema(name = "buildingName")
    private String buildingName;

    @Schema(name = "floorNumber")
    private String floorNumber;

    @Schema(name = "sideFloor")
    private String sideFloor;

    @Schema(name = "houseNumber")
    private String houseNumber;

    @Schema(name = "totalAddress")
    private String totalAddress;
}
