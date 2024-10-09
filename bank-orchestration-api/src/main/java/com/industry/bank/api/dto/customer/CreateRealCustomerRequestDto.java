package com.industry.bank.api.dto.customer;

import com.industry.bank.api.dto.general.location.AddressDto;
import com.industry.bank.api.dto.general.location.CityDto;
import com.industry.bank.api.enumeration.customer.GenderType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateRealCustomerRequestDto implements GeneralCustomerRequestDto {

    private String passportNumber;
    private String nationalCode;
    private String firstName;
    private String lastName;
    private GenderType gender;
    private Date birthdate;
    private CityDto birthCity;
    private AddressDto address;

}
