package com.industry.bank.api.dto.location;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "AddressDetailsDto" , title = "${AddressDetailsDto.title}" , description = "${AddressDetailsDto.description}")
public class AddressDetailsDto {

    @Schema(name = "postalCode" , title = "${AddressDetailsDto.postalCode.title}" , description = "${AddressDetailsDto.postalCode.description}")
    private String postalCode;
    @Schema(name = "province" , title = "${AddressDetailsDto.province.title}" , description = "${AddressDetailsDto.province.description}")
    private String province;
    @Schema(name = "townShip" , title = "${AddressDetailsDto.townShip.title}" , description = "${AddressDetailsDto.townShip.description}")
    private String townShip;
    @Schema(name = "village" , title = "${AddressDetailsDto.village.title}" , description = "${AddressDetailsDto.village.description}")
    private String village;
    @Schema(name = "city" , title = "${AddressDetailsDto.city.title}" , description = "${AddressDetailsDto.city.description}")
    private String city;
    @Schema(name = "localityType" , title = "${AddressDetailsDto.localityType.title}" , description = "${AddressDetailsDto.localityType.description}")
    private String localityType;
    @Schema(name = "localityName" , title = "${AddressDetailsDto.localityName.title}" , description = "${AddressDetailsDto.localityName.description}")
    private String localityName;
    @Schema(name = "localityCode" , title = "${AddressDetailsDto.localityCode.title}" , description = "${AddressDetailsDto.localityCode.description}")
    private String localityCode;
    @Schema(name = "subLocality" , title = "${AddressDetailsDto.subLocality.title}" , description = "${AddressDetailsDto.subLocality.description}")
    private String subLocality;
    @Schema(name = "zone" , title = "${AddressDetailsDto.zone.title}" , description = "${AddressDetailsDto.zone.description}")
    private String zone;
    @Schema(name = "firstStreet" , title = "${AddressDetailsDto.firstStreet.title}" , description = "${AddressDetailsDto.firstStreet.description}")
    private String firstStreet;
    @Schema(name = "secondStreet" , title = "${AddressDetailsDto.secondStreet.title}" , description = "${AddressDetailsDto.secondStreet.description}")
    private String secondStreet;
    @Schema(name = "buildingName" , title = "${AddressDetailsDto.buildingName.title}" , description = "${AddressDetailsDto.buildingName.description}")
    private String buildingName;
    @Schema(name = "floorNumber" , title = "${AddressDetailsDto.floorNumber.title}" , description = "${AddressDetailsDto.floorNumber.description}")
    private String floorNumber;
    @Schema(name = "sideFloor" , title = "${AddressDetailsDto.sideFloor.title}" , description = "${AddressDetailsDto.sideFloor.description}")
    private String sideFloor;
    @Schema(name = "houseNumber" , title = "${AddressDetailsDto.houseNumber.title}" , description = "${AddressDetailsDto.houseNumber.description}")
    private String houseNumber;
    @Schema(name = "totalAddress" , title = "${AddressDetailsDto.totalAddress.title}" , description = "${AddressDetailsDto.totalAddress.description}")
    private String totalAddress;
}
