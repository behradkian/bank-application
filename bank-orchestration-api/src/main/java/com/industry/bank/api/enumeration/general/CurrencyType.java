package com.industry.bank.api.enumeration.general;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.Arrays;

@Getter
@AllArgsConstructor
@Schema(enumAsRef = true)
public enum CurrencyType implements Serializable {

    USD(1, "USD"),
    EUR(2, "EUR"),
    GBP(3, "GBP"),
    JPY(4, "JPY"),
    CNY(5, "CNY"),
    CHF(6, "CHF"),
    CAD(7, "CAD"),
    AUD(8, "AUD"),
    NZD(9, "NZD"),
    INR(10, "INR"),
    BRL(11, "BRL"),
    RUB(12, "RUB"),
    MXN(13, "MXN"),
    ZAR(14, "ZAR"),
    KRW(15, "KRW"),
    HKD(16, "HKD"),
    SGD(17, "SGD"),
    NOK(18, "NOK"),
    SEK(19, "SEK"),
    DKK(20, "DKK"),
    TRY(21, "TRY"),
    AED(22, "AED"),
    SAR(23, "SAR"),
    ARS(24, "ARS"),
    CLP(25, "CLP"),
    COP(26, "COP"),
    PEN(27, "PEN"),
    TWD(28, "TWD"),
    THB(29, "THB"),
    IDR(30, "IDR"),
    MYR(31, "MYR"),
    VND(32, "VND"),
    PHP(33, "PHP"),
    PKR(34, "PKR"),
    EGP(35, "EGP"),
    NGN(36, "NGN"),
    KES(37, "KES"),
    GHS(38, "GHS"),
    MAD(39, "MAD"),
    ILS(40, "ILS"),
    BHD(41, "BHD"),
    QAR(42, "QAR"),
    KWD(43, "KWD"),
    OMR(44, "OMR"),
    IRR(45, "IRR");

    private final Integer code;
    private final String value;

    public static CurrencyType getByCode(int code) {
        return Arrays.stream(values()).filter(v -> v.code.equals(code)).findFirst()
                .orElse(null);
    }

    public static CurrencyType getByValue(String value) {
        return Arrays.stream(values()).filter(v -> v.value.equals(value)).findFirst()
                .orElse(null);
    }

    @Override
    public String toString() {
        return this.value;
    }

}