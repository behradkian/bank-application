package com.industry.bank.api.facade.user;

import com.industry.bank.api.dto.general.BankRequestHeader;
import com.industry.bank.api.dto.user.CreateUserRequestDto;
import com.industry.bank.api.dto.user.CreateUserResponseDto;
import com.industry.bank.api.dto.user.LoginUserRequestDto;
import com.industry.bank.api.dto.user.LoginUserResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@FeignClient
public interface UserApi {
    String PATH = "/user";

    @PostMapping(value = "/sign-up"
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    CreateUserResponseDto signupUser(@org.springframework.web.bind.annotation.RequestHeader BankRequestHeader<String , Object> headers, @RequestBody CreateUserRequestDto requestDto);

    @GetMapping(value = "/log-in"
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    LoginUserResponseDto logInUser(@org.springframework.web.bind.annotation.RequestHeader BankRequestHeader<String , Object> headers, @RequestBody LoginUserRequestDto requestDto);

    @GetMapping(value = "/log-out"
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    LoginUserResponseDto logOutUser(@org.springframework.web.bind.annotation.RequestHeader BankRequestHeader<String , Object> headers, @RequestBody LoginUserRequestDto requestDto);

}