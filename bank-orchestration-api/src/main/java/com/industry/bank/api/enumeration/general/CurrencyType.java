package com.industry.bank.api.enumeration.general;

import com.industry.bank.api.exception.runtime.InvalidEnumException;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum CurrencyType implements Serializable {

    IRR(1,"IRR"),
    USD(2,"USD"),
    EUR(3,"EUR");

    private final Integer code;
    private final String value;

    public static CurrencyType getByCode(int code) {
        return Arrays.stream(values()).filter(v -> v.code.equals(code)).findFirst()
                .orElseThrow(() -> new InvalidEnumException("code in CurrencyType is invalid : " + code));
    }

}