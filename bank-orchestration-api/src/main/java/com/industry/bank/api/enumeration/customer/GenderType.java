package com.industry.bank.api.enumeration.customer;

import com.industry.bank.api.exception.runtime.InvalidEnumException;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum GenderType implements Serializable {

    MALE(1, "MALE"),
    FEMALE(2, "FEMALE");

    private final Integer code;
    private final String value;

    public static GenderType getByCode(int code) {
        return Arrays.stream(values()).filter(v -> v.code.equals(code)).findFirst()
                .orElseThrow(() -> new InvalidEnumException("code in GenderType is invalid : " + code));
    }

    public static GenderType getByValue(String value) {
        return Arrays.stream(values()).filter(v -> v.value.equals(value)).findFirst()
                .orElseThrow(() -> new InvalidEnumException("value in GenderType is invalid : " + value));
    }

}
