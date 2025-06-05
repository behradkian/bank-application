package com.industry.bank.api.dto.customer;

/**
 * @author : Pedram Behradkian
 * @date : 2025/05/25
 */

import com.industry.bank.api.dto.Requester;
import com.industry.bank.api.dto.file.ImageDto;
import com.industry.bank.api.dto.general.NationalityDto;
import com.industry.bank.api.dto.location.AddressDto;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "CreateGeneralCustomerRequestDto")
public abstract class CreateGeneralCustomerRequestDto extends Requester implements Serializable {

    @NotBlank
    @Schema(name = "nationalityCode")
    private String nationalityCode;

    @Schema(name = "nationality")
    private NationalityDto nationality;

    @Schema(name = "phoneNumber")
    private String phoneNumber;

    @Schema(name = "email")
    private String email;

    @Schema(name = "addresses")
    private List<AddressDto> addresses;

    @Schema(name = "images")
    private List<ImageDto> images;
}