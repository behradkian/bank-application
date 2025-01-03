package com.industry.bank.api.dto.customer;

import com.industry.bank.api.dto.file.ImageDto;
import com.industry.bank.api.dto.general.NationalityDto;
import com.industry.bank.api.dto.location.AddressDto;
import com.industry.bank.api.enumeration.customer.CustomerType;
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
@Schema(name = "CreateCorporateCustomerRequestDto")
public class CreateCorporateCustomerRequestDto {

    @Schema(name = "name")
    private String name;

    @Schema(name = "registerDate")
    private Date registerDate;

    @Schema(name = "registerCode")
    private String registerCode;

    @Schema(name = "economicCode")
    private String economicCode;

    @Schema(name = "nationality")
    private NationalityDto nationality;

    @Schema(name = "phoneNumber")
    private String phoneNumber;

    @Schema(name = "email")
    private String email;

    @Schema(name = "addresses")
    private List<AddressDto> addresses;

    @Schema(name = "images")
    private List<ImageDto> images;

    @Hidden
    @Builder.Default
    @Schema(name = "type", defaultValue = "CORPORATE")
    private CustomerType type = CustomerType.CORPORATE;

}
