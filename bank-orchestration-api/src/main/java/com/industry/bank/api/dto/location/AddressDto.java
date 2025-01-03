package com.industry.bank.api.dto.location;

import com.industry.bank.api.enumeration.general.AddressType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "AddressDto")
public class AddressDto {

    @Schema(name = "city")
    private CityDto city;

    @Schema(name = "addressType")
    private AddressType addressType;

    @Schema(name = "addressDetails")
    private AddressDetailsDto addressDetails;

}
