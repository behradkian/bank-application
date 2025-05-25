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
@Schema(name = "CreateRealCustomerResponseDto")
public class CreateRealCustomerResponseDto extends CreateGeneralCustomerResponseDto implements Serializable {
    @Hidden
    @Schema(name = "type", defaultValue = "REAL")
    private CustomerType type = CustomerType.REAL;
}