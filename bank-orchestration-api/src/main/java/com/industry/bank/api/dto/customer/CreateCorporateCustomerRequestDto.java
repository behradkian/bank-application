package com.industry.bank.api.dto.customer;

import com.industry.bank.api.dto.file.ImageDto;
import com.industry.bank.api.dto.general.NationalityDto;
import com.industry.bank.api.dto.location.AddressDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "CreateCorporateCustomerRequestDto", title = "", description = "")
public class CreateCorporateCustomerRequestDto implements GeneralCustomerRequestDto {

    private String name;
    private Date registerDate;
    private String registerCode;
    private String economicCode;
    private NationalityDto nationality;
    private String phoneNumber;
    private String email;
    private List<AddressDto> addresses;
    private List<ImageDto> images;

}
