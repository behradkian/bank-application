package com.industry.bank.api.dto.customer;

import com.industry.bank.api.dto.file.ImageDto;
import com.industry.bank.api.dto.general.NationalityDto;
import com.industry.bank.api.dto.location.AddressDto;
import com.industry.bank.api.dto.general.OccupationDto;
import com.industry.bank.api.dto.location.CityDto;
import com.industry.bank.api.enumeration.customer.CustomerType;
import com.industry.bank.api.enumeration.customer.GenderType;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "CreateRealCustomerRequestDto", title = "${CreateRealCustomerRequestDto.title}", description = "${CreateRealCustomerRequestDto.description}")
public class CreateRealCustomerRequestDto {


    @Schema(name = "firstName", title = "${CreateRealCustomerRequestDto.firstName.title}", description = "${CreateRealCustomerRequestDto.firstName.description}")
    private String firstName;

    @Schema(name = "lastName", title = "${CreateRealCustomerRequestDto.lastName.title}", description = "${CreateRealCustomerRequestDto.lastName.description}")
    private String lastName;

    @Schema(name = "fatherName", title = "${CreateRealCustomerRequestDto.fatherName.title}", description = "${CreateRealCustomerRequestDto.fatherName.description}")
    private String fatherName;

    @Schema(name = "mobileNumber", title = "${CreateRealCustomerRequestDto.mobileNumber.title}", description = "${CreateRealCustomerRequestDto.mobileNumber.description}")
    private String mobileNumber;

    @Schema(name = "passportNumber", title = "${CreateRealCustomerRequestDto.passportNumber.title}", description = "${CreateRealCustomerRequestDto.passportNumber.description}")
    private String passportNumber;

    @Schema(name = "nationalCode", title = "${CreateRealCustomerRequestDto.nationalCode.title}", description = "${CreateRealCustomerRequestDto.nationalCode.description}")
    private String nationalCode;

    @Schema(name = "nationality", title = "${CreateRealCustomerRequestDto.nationality.title}", description = "${CreateRealCustomerRequestDto.nationality.description}")
    private NationalityDto nationality;

    @Schema(name = "birthdate", title = "${CreateRealCustomerRequestDto.birthdate.title}", description = "${CreateRealCustomerRequestDto.birthdate.description}")
    private Date birthdate;

    @Schema(name = "birthCity", title = "${CreateRealCustomerRequestDto.birthCity.title}", description = "${CreateRealCustomerRequestDto.birthCity.description}")
    private CityDto birthCity;

    @Schema(name = "phoneNumber", title = "${CreateRealCustomerRequestDto.phoneNumber.title}", description = "${CreateRealCustomerRequestDto.phoneNumber.description}")
    private String phoneNumber;

    @Schema(name = "email", title = "${CreateRealCustomerRequestDto.email.title}", description = "${CreateRealCustomerRequestDto.email.description}")
    private String email;

    @Schema(name = "gender", title = "${CreateRealCustomerRequestDto.gender.title}", description = "${CreateRealCustomerRequestDto.gender.description}")
    private GenderType gender;

    @Schema(name = "occupation", title = "${CreateRealCustomerRequestDto.occupation.title}", description = "${CreateRealCustomerRequestDto.occupation.description}")
    private OccupationDto occupation;

    @Schema(name = "addresses", title = "${CreateRealCustomerRequestDto.addresses.title}", description = "${CreateRealCustomerRequestDto.addresses.description}")
    private List<AddressDto> addresses;

    @Schema(name = "images", title = "${CreateRealCustomerRequestDto.images.title}", description = "${CreateRealCustomerRequestDto.images.description}")
    private List<ImageDto> images;

    @Schema(name = "customerRelations", title = "${CreateRealCustomerRequestDto.customerRelations.title}", description = "${CreateRealCustomerRequestDto.customerRelations.description}")
    private List<RelatedCustomerDto> customerRelations;

    @Hidden
    @Builder.Default
    @Schema(title = "", name = "type", description = "", defaultValue = "Real")
    private CustomerType type = CustomerType.REAL;

}
