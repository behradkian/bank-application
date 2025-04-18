package com.industry.bank.api.enumeration.general;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 */
@Getter
@AllArgsConstructor
@Schema(enumAsRef = true)
public enum GenderType implements Serializable {

    /**
     * مرد
     */
    MALE(1, "MALE"),

    /**
     * زن
     */
    FEMALE(2, "FEMALE");

    private final Integer code;
    private final String value;

    public static GenderType getByCode(int code) {
        return Arrays.stream(values()).filter(v -> v.code.equals(code)).findFirst()
                .orElse(null);
    }

    public static GenderType getByValue(String value) {
            return Arrays.stream(values()).filter(v -> v.value.equals(value)).findFirst()
                    .orElse(null);
    }

    @Override
    public String toString() {
        return this.value;
    }
}
