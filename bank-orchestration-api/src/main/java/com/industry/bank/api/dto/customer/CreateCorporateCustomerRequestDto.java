package com.industry.bank.api.dto.customer;

import com.industry.bank.api.enumeration.customer.CustomerType;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "CreateCorporateCustomerRequestDto")
public class CreateCorporateCustomerRequestDto extends CreateGeneralCustomerRequestDto implements Serializable {
    @Hidden
    @Schema(name = "type", defaultValue = "CORPORATE")
    private CustomerType type = CustomerType.CORPORATE;

    @Schema(name = "fullName")
    private String fullName;

    @Schema(name = "registerDate")
    private Date registerDate;

    @Schema(name = "registerCode")
    private String registerCode;

    @Schema(name = "economicCode")
    private String economicCode;
}