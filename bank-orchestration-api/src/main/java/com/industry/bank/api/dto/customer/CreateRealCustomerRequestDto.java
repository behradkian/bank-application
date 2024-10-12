package com.industry.bank.api.dto.customer;

import com.industry.bank.api.dto.location.CityDto;
import com.industry.bank.api.enumeration.customer.GenderType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateRealCustomerRequestDto extends CreateGeneralCustomerRequestDto{

    private String passportNumber;
    private String nationalCode;
    private String firstName;
    private String lastName;
    private String mobileNumber;

    private Date birthdate;
    private CityDto birthCity;

    private GenderType gender;

    private OccupationDto occupation;
    private List<RelatedCustomerDto> customerRelations;

}
