package com.industry.bank.api.dto.location;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author : Pedram Behradkian
 * @date : 2025/06/05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "AddAddressResponseDto")
public class AddAddressResponseDto implements Serializable {
    private String postalCode;
}