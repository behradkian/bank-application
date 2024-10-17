package com.industry.bank.api.enumeration.general;

import com.industry.bank.api.exception.runtime.InvalidEnumException;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
@Schema(enumAsRef = true , title = "${ImageType.title}" , description = "${ImageType.description}")
public enum ImageType {


    @Schema(name = "SIGNATURE" , title = "${ImageType.signature.title}" , description = "${ImageType.signature.description}")
    SIGNATURE(1),
    @Schema(name = "PICTURE" , title = "${ImageType.picture.title}" , description = "${ImageType.picture.description}")
    PICTURE(2);

    private Integer code;

    public static ImageType getByCode(int code) {
        return Arrays.stream(values()).filter(v -> v.code.equals(code)).findFirst()
                .orElseThrow(() -> new InvalidEnumException("code in ImageType is invalid : " + code));
    }
}
