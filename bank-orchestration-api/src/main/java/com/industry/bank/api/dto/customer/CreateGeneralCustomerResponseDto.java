package com.industry.bank.api.dto.customer;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "CreateGeneralCustomerResponseDto", title = "${CreateGeneralCustomerResponseDto.title}", description = "${CreateGeneralCustomerResponseDto.description}")
public class CreateGeneralCustomerResponseDto {

    @Schema(name = "customerNumber", title = "${customerNumber.title}", description = "${customerNumber.description}")
    private String customerNumber;

    @Schema(name = "customerRegisterDate", title = "${CreateGeneralCustomerResponseDto.customerRegisterDate.title}", description = "${CreateGeneralCustomerResponseDto.customerRegisterDate.description}")
    private Date customerRegisterDate;

}