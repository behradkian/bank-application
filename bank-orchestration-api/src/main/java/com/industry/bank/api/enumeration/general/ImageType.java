package com.industry.bank.api.enumeration.general;

import com.industry.bank.api.exception.runtime.InvalidEnumException;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.Arrays;

@Getter
@RequiredArgsConstructor
@Schema(enumAsRef = true , title = "${ImageType.title}" , description = "${ImageType.description}")
public enum ImageType implements Serializable {

    @Schema(name = "SIGNATURE" , title = "${ImageType.signature.title}" , description = "${ImageType.signature.description}")
    SIGNATURE (1),

    @Schema(name = "PICTURE" , title = "${ImageType.picture.title}" , description = "${ImageType.picture.description}")
    PICTURE(2);

    private final Integer code;

    public static ImageType getByCode(int code) {
        return Arrays.stream(values()).filter(v -> v.code.equals(code)).findFirst()
                .orElseThrow(() -> new InvalidEnumException("code in ImageType is invalid : " + code));
    }

}
