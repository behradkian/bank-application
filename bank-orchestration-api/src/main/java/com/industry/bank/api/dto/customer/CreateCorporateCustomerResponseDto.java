package com.industry.bank.api.dto.customer;

import com.industry.bank.api.enumeration.customer.CustomerType;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@AllArgsConstructor
@Schema(name = "CreateCorporateCustomerResponseDto", title = "", description = "")
public class CreateCorporateCustomerResponseDto extends CreateGeneralCustomerResponseDto{

    @Hidden
    @Builder.Default
    @Schema(title = "", name = "type", description = "", defaultValue = "CORPORATE")
    private CustomerType type = CustomerType.CORPORATE;

}
