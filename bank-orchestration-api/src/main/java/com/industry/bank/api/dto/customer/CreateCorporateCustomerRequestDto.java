package com.industry.bank.api.dto.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCorporateCustomerRequestDto implements GeneralCustomerRequestDto {

    private String name;
    private Date registerDate;
    private String registerCode;

}
