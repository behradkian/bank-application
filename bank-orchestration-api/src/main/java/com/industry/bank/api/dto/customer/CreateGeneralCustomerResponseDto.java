package com.industry.bank.api.dto.customer;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "CreateGeneralCustomerResponseDto")
public abstract class CreateGeneralCustomerResponseDto implements Serializable {
    @Schema(name = "customerNumber")
    private String customerNumber;
}