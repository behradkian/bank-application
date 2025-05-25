package com.industry.bank.api.dto.customer;

import com.industry.bank.api.dto.general.OccupationDto;
import com.industry.bank.api.dto.location.CityDto;
import com.industry.bank.api.enumeration.customer.CustomerType;
import com.industry.bank.api.enumeration.customer.DegreeType;
import com.industry.bank.api.enumeration.general.GenderType;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.io.Serializable;
import java.util.Date;


@Setter
@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "CreateRealCustomerRequestDto")
public class CreateRealCustomerRequestDto extends CreateGeneralCustomerRequestDto implements Serializable {
    @Hidden
    @Schema(name = "type", defaultValue = "REAL")
    private CustomerType type = CustomerType.REAL;

    @NotBlank
    @Schema(name = "firstName")
    private String firstName;

    @NotBlank
    @Schema(name = "lastName")
    private String lastName;

    @Schema(name = "fatherName")
    private String fatherName;

    @Schema(name = "passportNumber")
    private String passportNumber;

    @NotBlank
    @Schema(name = "birthdate")
    private Date birthdate;

    @Schema(name = "birthCity")
    private CityDto birthCity;

    @Schema(name = "mobileNumber")
    private String mobileNumber;

    @Schema(name = "gender")
    private GenderType gender;

    @Schema(name = "occupation")
    private OccupationDto occupation;

    @Schema(name = "degree")
    private DegreeType degree;
}