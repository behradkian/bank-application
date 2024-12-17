package com.industry.bank.api.dto.customer;

import com.industry.bank.api.enumeration.customer.CustomerType;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Schema(name = "CreateCorporateCustomerResponseDto", title = "", description = "")
public class CreateCorporateCustomerResponseDto extends CreateGeneralCustomerResponseDto {

    @Hidden
    @Builder.Default
    @Schema(name = "type", title = "", description = "", defaultValue = "CORPORATE")
    private CustomerType type = CustomerType.CORPORATE;

}