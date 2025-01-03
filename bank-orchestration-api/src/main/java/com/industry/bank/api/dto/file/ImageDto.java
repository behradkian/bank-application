package com.industry.bank.api.dto.file;

import com.industry.bank.api.enumeration.general.ImageType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "ImageDto")
public class ImageDto {

    @Schema(name = "imageType")
    private ImageType imageType;

    @Schema(name = "imageData")
    private FileDto imageData;

}
