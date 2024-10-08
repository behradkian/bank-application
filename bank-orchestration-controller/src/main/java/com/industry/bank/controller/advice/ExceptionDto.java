package com.industry.bank.controller.advice;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

@Data
@AllArgsConstructor
public class ExceptionDto {

    private String message;
    private Throwable throwable;
    private HttpStatus httpStatus;
    private ZonedDateTime timeStamp;

}
