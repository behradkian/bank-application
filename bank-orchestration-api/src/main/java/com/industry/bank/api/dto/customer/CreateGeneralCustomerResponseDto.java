package com.industry.bank.api.dto.customer;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "CreateGeneralCustomerResponseDto")
public class CreateGeneralCustomerResponseDto {

    @Schema(name = "customerNumber")
    private String customerNumber;

    @Schema(name = "customerRegisterDate")
    private Date customerRegisterDate;

}