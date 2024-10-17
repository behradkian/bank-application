package com.industry.bank.api.enumeration.general;

import com.industry.bank.api.exception.runtime.InvalidEnumException;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.Arrays;

@Getter
@AllArgsConstructor
@Schema(enumAsRef = true , title = "${AddressType.title}" , description = "${AddressType.description}")
public enum AddressType implements Serializable {

    @Schema(name = "HOME" , title = "${AddressType.home.title}" , description = "${AddressType.home.description}")
    HOME(1),
    @Schema(name = "WORK" , title = "${AddressType.work.title}" , description = "${AddressType.work.description}")
    WORK(2);

    private Integer code;

    public static AddressType getByCode(int code) {
        return Arrays.stream(values()).filter(v -> v.code.equals(code)).findFirst()
                .orElseThrow(() -> new InvalidEnumException("code in AddressType is invalid : " + code));
    }

}