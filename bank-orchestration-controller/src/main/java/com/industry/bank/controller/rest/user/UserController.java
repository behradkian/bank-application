package com.industry.bank.controller.rest.user;

import com.industry.bank.api.facade.user.UserFacade;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Tag(name = "user services")
@RequestMapping(path = UserFacade.PATH)
public class UserController implements UserFacade {
}
