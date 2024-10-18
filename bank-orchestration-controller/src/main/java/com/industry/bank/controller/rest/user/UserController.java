package com.industry.bank.controller.rest.user;

import com.industry.bank.api.facade.GeneralFacade;
import com.industry.bank.api.facade.UserFacade;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path = UserFacade.PATH)
public class UserController implements UserFacade {
}
