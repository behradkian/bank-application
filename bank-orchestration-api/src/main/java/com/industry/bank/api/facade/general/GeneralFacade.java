package com.industry.bank.api.facade.general;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient

public interface GeneralFacade {

    String PATH = "/general";

}
