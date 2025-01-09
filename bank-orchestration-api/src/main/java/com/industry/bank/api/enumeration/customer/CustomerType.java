package com.industry.bank.api.enumeration.customer;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.Arrays;

@Getter
@AllArgsConstructor
@Schema(enumAsRef = true)
public enum CustomerType implements Serializable {

    /**
     * مشتری حقیقی
     */
    REAL(1, "REAL"),

    /**
     * مشتری حقوقی
     */
    CORPORATE(2, "CORPORATE");

    private final Integer code;
    private final String value;

    public static CustomerType getByCode(int code) {
        return Arrays.stream(values()).filter(v -> v.code.equals(code)).findFirst()
                .orElse(null);
    }

    public static CustomerType getByValue(String value) {
        return Arrays.stream(values()).filter(v -> v.value.equals(value)).findFirst()
                .orElse(null);
    }

    @Override
    public String toString() {
        return this.value;
    }

}