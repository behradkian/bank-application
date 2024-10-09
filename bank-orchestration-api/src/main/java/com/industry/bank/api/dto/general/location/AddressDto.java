package com.industry.bank.api.dto.general.location;

import com.industry.bank.api.enumeration.general.AddressType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {

    private CityDto city;
    private AddressType addressType;
    private AddressDetailsDto addressDetails;

}
