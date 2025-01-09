package com.industry.bank.api.enumeration.general;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.Arrays;

@Getter
@AllArgsConstructor
@Schema(enumAsRef = true)
public enum CustomerImageType implements Serializable {

    SIGNATURE(1, "SIGNATURE"),
    PHOTO(2, "PHOTO");

    private final Integer code;
    private final String value;

    public static CustomerImageType getByCode(int code) {
        return Arrays.stream(values()).filter(v -> v.code.equals(code)).findFirst()
                .orElse(null);
    }

    public static CustomerImageType getByValue(String value) {
        return Arrays.stream(values()).filter(v -> v.value.equals(value)).findFirst()
                .orElse(null);
    }

    @Override
    public String toString() {
        return this.value;
    }

}