package com.industry.bank.controller.rest.general;

import com.industry.bank.api.facade.DepositFacade;
import com.industry.bank.api.facade.GeneralFacade;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path = GeneralFacade.PATH)
public class GeneralController implements GeneralFacade {

}
