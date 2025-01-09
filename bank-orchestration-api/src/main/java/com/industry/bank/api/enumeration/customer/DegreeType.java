package com.industry.bank.api.enumeration.customer;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.Arrays;

@Getter
@AllArgsConstructor
@Schema(enumAsRef = true)
public enum DegreeType implements Serializable {

    ILLITERATE(0, "ILLITERATE"), // بی‌سواد
    LITERATE(1, "LITERATE"), // سواد ابتدایی یا خواندن و نوشتن
    CYCLE(2, "CYCLE"),//سیکل (متوسطه اول)
    HIGH_SCHOOL_DIPLOMA(3, "HIGH_SCHOOL_DIPLOMA"),//دیپلم متوسطه
    ASSOCIATE(4, "ASSOCIATE"),//کاردانی
    BACHELOR(5, "BACHELOR"),//کارشناسی
    MASTER(6, "MASTER"),//کارشناسی ارشد
    DOCTORATE(7, "DOCTORATE"),//دکترا
    POST_DOCTORATE(8, "POST_DOCTORATE");//پسادکترا

    private final Integer code;
    private final String value;

    public static DegreeType getByCode(int code) {
        return Arrays.stream(values()).filter(v -> v.code.equals(code)).findFirst()
                .orElse(null);
    }

    public static DegreeType getByValue(String value) {
        return Arrays.stream(values()).filter(v -> v.value.equals(value)).findFirst()
                .orElse(null);
    }

    @Override
    public String toString() {
        return this.value;
    }
}