package com.industry.bank.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * @author : Pedram Behradkian
 * @date : 2025/06/06
 */
@Data
@AllArgsConstructor
@Schema(name = "PageResponse")
public class PageResponse<T> implements Serializable {
    private List<T> content;
    private int page;
    private int size;
    private long totalElements;
}
