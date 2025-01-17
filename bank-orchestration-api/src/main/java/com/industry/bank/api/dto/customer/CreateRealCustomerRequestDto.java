package com.industry.bank.api.dto.customer;

import com.industry.bank.api.dto.file.ImageDto;
import com.industry.bank.api.dto.general.NationalityDto;
import com.industry.bank.api.dto.location.AddressDto;
import com.industry.bank.api.dto.general.OccupationDto;
import com.industry.bank.api.dto.location.CityDto;
import com.industry.bank.api.enumeration.customer.CustomerType;
import com.industry.bank.api.enumeration.general.GenderType;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
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
@Schema(name = "CreateRealCustomerRequestDto")
public class CreateRealCustomerRequestDto {

    @Hidden
    @Builder.Default
    @Schema(name = "type", defaultValue = "Real")
    private CustomerType type = CustomerType.REAL;

    @NotBlank
    @Schema(name = "firstName")
    private String firstName;

    @NotBlank
    @Schema(name = "lastName")
    private String lastName;

    @Schema(name = "fatherName")
    private String fatherName;

    @NotBlank
    @Schema(name = "nationalCode")
    private String nationalCode;

    @Schema(name = "passportNumber")
    private String passportNumber;

    @Schema(name = "nationality")
    private NationalityDto nationality;

    @NotBlank
    @Schema(name = "birthdate")
    private Date birthdate;

    @Schema(name = "birthCity")
    private CityDto birthCity;

    @Schema(name = "mobileNumber")
    private String mobileNumber;

    @Schema(name = "phoneNumber")
    private String phoneNumber;

    @Schema(name = "email")
    private String email;

    @Schema(name = "gender")
    private GenderType gender;

    @Schema(name = "occupation")
    private OccupationDto occupation;

    @Schema(name = "addresses")
    private List<AddressDto> addresses;

    @Schema(name = "images")
    private List<ImageDto> images;

}
