package com.industry.bank.api.dto.customer;

import com.industry.bank.api.dto.file.ImageDto;
import com.industry.bank.api.dto.general.NationalityDto;
import com.industry.bank.api.dto.location.AddressDto;
import com.industry.bank.api.dto.location.CityDto;
import com.industry.bank.api.enumeration.customer.GenderType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "CreateRealCustomerRequestDto", title = "", description = "")
public class CreateRealCustomerRequestDto implements GeneralCustomerRequestDto{


    private String firstName;
    private String lastName;
    private String fatherName;
    private String mobileNumber;
    private String passportNumber;
    private String nationalCode;
    private NationalityDto nationality;

    private Date birthdate;
    private CityDto birthCity;

    private String phoneNumber;
    private String email;
    private GenderType gender;
    private OccupationDto occupation;

    private List<AddressDto> addresses;
    private List<ImageDto> images;
    private List<RelatedCustomerDto> customerRelations;

}
