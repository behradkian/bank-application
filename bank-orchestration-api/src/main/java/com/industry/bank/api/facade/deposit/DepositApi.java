package com.industry.bank.api.facade.deposit;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient
public interface DepositApi {

    String PATH = "/deposit";
}
