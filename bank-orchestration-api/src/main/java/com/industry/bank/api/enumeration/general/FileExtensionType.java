package com.industry.bank.api.enumeration.general;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Getter
@RequiredArgsConstructor
@Schema(enumAsRef = true , title = "${FileExtensionType.title}" , description = "${FileExtensionType.description}")
public enum FileExtensionType implements Serializable {

    @Schema(name = "PDF" , title = "${FileExtensionType.pdf.title}" , description = "${FileExtensionType.pdf.description}")
    PDF(1,"PDF"),

    @Schema(name = "JPEG" , title = "${FileExtensionType.jpeg.title}" , description = "${FileExtensionType.jpeg.description}")
    JPEG(2,"JPEG"),

    @Schema(name = "JPG" , title = "${FileExtensionType.jpg.title}" , description = "${FileExtensionType.jpg.description}")
    JPG(3,"JPG"),

    @Schema(name = "PNG" , title = "${FileExtensionType.png.title}" , description = "${FileExtensionType.png.description}")
    PNG(4,"PNG");

    private final Integer code;
    private final String value;

}
