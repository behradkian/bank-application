package com.industry.bank.api.enumeration.general;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
@AllArgsConstructor
@Schema(enumAsRef = true)
public enum FileExtensionType implements Serializable {

    PDF(1, "PDF"),
    JPEG(2, "JPEG"),
    JPG(3, "JPG"),
    PNG(4, "PNG");

    private final Integer code;
    private final String value;


    @Override
    public String toString() {
        return this.value;
    }
}