package com.industry.bank.api.dto.customer;

import com.industry.bank.api.enumeration.customer.CustomerType;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Schema(name = "CreateRealCustomerResponseDto", title = "", description = "")
public class CreateRealCustomerResponseDto extends CreateGeneralCustomerResponseDto{

    @Hidden
    @Builder.Default
    @Schema(title = "", name = "type", description = "", defaultValue = "REAL")
    private CustomerType type = CustomerType.REAL;

}
