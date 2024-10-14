package com.industry.bank.api.dto.customer;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "CreateGeneralCustomerResponseDto", title = "", description = "")
public class CreateGeneralCustomerResponseDto {

    private String customerNumber;

}
