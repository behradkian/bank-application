package com.industry.bank.api.dto.customer;

import com.industry.bank.api.dto.general.BaseRequest;
import com.industry.bank.api.dto.file.ImageDto;
import com.industry.bank.api.dto.general.NationalityDto;
import com.industry.bank.api.dto.location.AddressDto;
import com.industry.bank.api.enumeration.customer.CustomerType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateGeneralCustomerRequestDto extends BaseRequest {

    private CustomerType type;
    private NationalityDto nationality;

    private String phoneNumber;
    private String email;

    private List<AddressDto> addresses;
    private List<ImageDto> images;

}