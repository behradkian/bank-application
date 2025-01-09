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

    /**
     *  بی‌سواد
     */
    ILLITERATE(0, "ILLITERATE"),

    /**
     * سواد ابتدایی یا خواندن و نوشتن
     */
    LITERATE(1, "LITERATE"),

    /**
     * سیکل (متوسطه اول)
     */
    CYCLE(2, "CYCLE"),

    /**
     * دیپلم متوسطه
     */
    HIGH_SCHOOL_DIPLOMA(3, "HIGH_SCHOOL_DIPLOMA"),

    /**
     * کاردانی
     */
    ASSOCIATE(4, "ASSOCIATE"),

    /**
     * کارشناسی
     */
    BACHELOR(5, "BACHELOR"),

    /**
     * کارشناسی ارشد
     */
    MASTER(6, "MASTER"),

    /**
     * دکترا
     */
    DOCTORATE(7, "DOCTORATE"),

    /**
     * پسادکترا
     */
    POST_DOCTORATE(8, "POST_DOCTORATE");

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