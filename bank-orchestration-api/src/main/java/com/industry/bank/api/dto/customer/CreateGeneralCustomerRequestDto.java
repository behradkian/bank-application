package com.industry.bank.api.dto.customer;

import com.industry.bank.api.dto.general.BaseRequest;
import com.industry.bank.api.enumeration.customer.CustomerType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "CreateGeneralCustomerRequestDto", title = "", description = "")
public class CreateGeneralCustomerRequestDto extends BaseRequest {

    @Schema(title = "", name = "type", description = "", example = "REAL")
    private CustomerType type;
    private GeneralCustomerRequestDto customerDetails;

}