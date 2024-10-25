package com.industry.bank.api.facade.user;

import com.industry.bank.api.dto.general.BankOrchestrationRequestHeader;
import com.industry.bank.api.dto.user.CreateUserRequestDto;
import com.industry.bank.api.dto.user.CreateUserResponseDto;
import com.industry.bank.api.dto.user.LoginUserRequestDto;
import com.industry.bank.api.dto.user.LoginUserResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.openfeign.FeignClient;

public interface UserFacade {
    String PATH = "/user";

    @PostMapping(value = "/sign-up"
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    CreateUserResponseDto signupUser(@RequestHeader BankOrchestrationRequestHeader<String , Object> headers, @RequestBody CreateUserRequestDto requestDto);

    @GetMapping(value = "/sign-in"
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    LoginUserResponseDto signInUser(@RequestHeader BankOrchestrationRequestHeader<String , Object> headers, @RequestBody LoginUserRequestDto requestDto);
}