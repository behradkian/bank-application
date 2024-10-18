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

    @Schema(title = "", name = "name", description = "", example = "erfan")
    private String name;
    @Schema(title = "", name = "registerDate", description = "", example = "1403/07/20")
    private Date registerDate;
    @Schema(title = "", name = "registerCode", description = "", example = "3556813")
    private String registerCode;
    @Schema(title = "", name = "economicCode", description = "", example = "584318497")
    private String economicCode;
    private NationalityDto nationality;
    private String phoneNumber;
    private String email;
    private List<AddressDto> addresses;
    private List<ImageDto> images;

}
