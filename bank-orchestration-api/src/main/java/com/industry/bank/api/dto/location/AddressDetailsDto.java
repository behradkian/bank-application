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

    /**
     * کدپستی
     */
    @Schema(name = "postalCode")
    private String postalCode;

    /**
     * استان
     */
    @Schema(name = "province")
    private String province;

    /**
     * شهرستان
     */
    @Schema(name = "townShip")
    private String townShip;

    /**
     * شهر
     */
    @Schema(name = "city")
    private String city;

    /**
     * نام محله
     */
    @Schema(name = "localityName")
    private String localityName;

    /**
     * کد محله
     */
    @Schema(name = "localityCode")
    private String localityCode;

    /**
     * منطقه
     */
    @Schema(name = "zone")
    private String zone;

    /**
     * خیابان اصلی
     */
    @Schema(name = "firstStreet")
    private String firstStreet;

    /**
     * خیابان فرعی
     */
    @Schema(name = "secondStreet")
    private String secondStreet;

    /**
     * پلاک
     */
    @Schema(name = "houseNumber")
    private String houseNumber;

    /**
     * نام ساختمان
     */
    @Schema(name = "buildingName")
    private String buildingName;

    /**
     * شماره طبقه
     */
    @Schema(name = "floorNumber")
    private String floorNumber;

    /**
     * واحد
     */
    @Schema(name = "sideFloor")
    private String sideFloor;

}