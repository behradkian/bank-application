package com.industry.bank.api.facade.user;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient
public interface UserFacade {

    String PATH = "/user";
}
