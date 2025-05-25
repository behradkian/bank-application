package com.industry.bank.api.dto.customer;

import com.industry.bank.api.enumeration.customer.CustomerType;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "CreateCorporateCustomerResponseDto")
public class CreateCorporateCustomerResponseDto extends CreateGeneralCustomerResponseDto implements Serializable {
    @Hidden
    @Schema(name = "type", defaultValue = "CORPORATE")
    private CustomerType type = CustomerType.CORPORATE;
}