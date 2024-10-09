package com.industry.bank.api.dto.customer;

import com.industry.bank.api.enumeration.customer.CustomerType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateGeneralCustomerRequestDto {

    private CustomerType type;
    private GeneralCustomerRequestDto customerData;

}