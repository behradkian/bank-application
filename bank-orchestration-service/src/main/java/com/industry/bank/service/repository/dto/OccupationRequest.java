package com.industry.bank.service.repository.dto;

import lombok.*;

/**
 * @author : Pedram Behradkian
 * @date : 2025/01/28
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OccupationRequest {

    private String occupationId;
    private String occupationCode;
    private String occupationName;

}