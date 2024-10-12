package com.industry.bank.api.enumeration.general;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
@AllArgsConstructor
public enum FileExtensionType implements Serializable {

    PDF(1,"PDF"),
    JPEG(2,"JPEG"),
    JPG(3,"JPG"),
    PNG(4,"PNG");

    private final Integer code;
    private final String name;

}
