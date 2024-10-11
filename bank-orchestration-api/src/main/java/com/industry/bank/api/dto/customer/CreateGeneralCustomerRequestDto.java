package com.industry.bank.api.dto.customer;

import com.industry.bank.api.dto.general.BaseRequest;
import com.industry.bank.api.dto.general.NationalityDto;
import com.industry.bank.api.dto.general.location.AddressDto;
import com.industry.bank.api.dto.general.location.CountryDto;
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
    private GeneralCustomerRequestDto customerData;

    private List<AddressDto> addressDto;
    private String phoneNumber;
    private CountryDto countryCode;
    private NationalityDto nationality;
}