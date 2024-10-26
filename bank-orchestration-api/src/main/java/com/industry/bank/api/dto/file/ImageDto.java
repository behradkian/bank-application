package com.industry.bank.api.dto.file;

import com.industry.bank.api.enumeration.general.ImageType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "ImageDto", title = "${ImageDto.title}", description = "${ImageDto.description}")
public class ImageDto {

    @Schema(name = "name", title = "${ImageDto.imageType.title}", description = "${ImageDto.imageType.description}")
    private ImageType imageType;

    @Schema(name = "imageData", title = "${ImageDto.imageDate.title}", description = "${ImageDto.imageData.description}")
    private FileDto imageData;

}
