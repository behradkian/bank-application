package com.industry.bank.api.enumeration.customer;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

/**
 * @author : Pedram Behradkian
 * @date : 2025/01/29
 */
@Getter
@AllArgsConstructor
public enum DegreeType implements Serializable {
    ILLITERATE(0, "ILLITERATE"),
    LITERATE(1, "LITERATE"),
    CYCLE(2, "CYCLE"),
    HIGH_SCHOOL_DIPLOMA(3, "HIGH_SCHOOL_DIPLOMA"),
    ASSOCIATE(4, "ASSOCIATE"),
    BACHELOR(5, "BACHELOR"),
    MASTER(6, "MASTER"),
    DOCTORATE(7, "DOCTORATE"),
    POST_DOCTORATE(8, "POST_DOCTORATE");

    private final Integer code;
    private final String value;

}