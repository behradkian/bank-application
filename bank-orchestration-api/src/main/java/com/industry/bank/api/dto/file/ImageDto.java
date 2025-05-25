package com.industry.bank.api.dto.file;

import com.industry.bank.api.enumeration.general.CustomerImageType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "ImageDto")
public class ImageDto implements Serializable {
    @Schema(name = "imageType")
    private CustomerImageType customerImageType;

    @Schema(name = "imageData")
    private FileDto imageData;
}