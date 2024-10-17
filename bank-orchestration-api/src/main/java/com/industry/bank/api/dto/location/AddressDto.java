package com.industry.bank.api.dto.location;

import com.industry.bank.api.enumeration.general.AddressType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "AddressDto" , title = "${AddressDto.title}" , description = "${AddressDto.description}")
public class AddressDto {

    @Schema(name = "city" , title = "${AddressDto.city.title}" , description = "${AddressDto.city.description}")
    private CityDto city;
    @Schema(name = "addressType" , title = "${AddressDto.addressType.title}" , description = "${AddressDto.addressType.description}")
    private AddressType addressType;
    @Schema(name = "addressDetails" , title = "${AddressDto.addressDetails.title}" , description = "${AddressDto.addressDetails.description}")
    private AddressDetailsDto addressDetails;

}
