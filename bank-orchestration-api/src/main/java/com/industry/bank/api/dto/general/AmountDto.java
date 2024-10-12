package com.industry.bank.api.dto.general;

import com.industry.bank.api.enumeration.general.CurrencyType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AmountDto {

    private BigDecimal amount;
    private CurrencyType currency;

}