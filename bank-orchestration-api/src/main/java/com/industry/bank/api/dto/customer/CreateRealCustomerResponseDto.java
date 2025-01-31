package com.industry.bank.api.dto.customer;

import com.industry.bank.api.enumeration.customer.CustomerType;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "CreateRealCustomerResponseDto")
public class CreateRealCustomerResponseDto extends CreateGeneralCustomerResponseDto {

    @Hidden
    @Builder.Default
    @Schema(name = "type", defaultValue = "REAL")
    private CustomerType type = CustomerType.REAL;

}
