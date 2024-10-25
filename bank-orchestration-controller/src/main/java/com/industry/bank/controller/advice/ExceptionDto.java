package com.industry.bank.controller.advice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionDto {

    private String message;
    private Throwable throwable;
    private HttpStatus httpStatus;
    private ZonedDateTime timeStamp;

}
