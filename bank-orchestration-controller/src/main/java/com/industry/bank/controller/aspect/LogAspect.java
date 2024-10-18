package com.industry.bank.controller.aspect;
//todo back when service is written

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
public class LogAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogAspect.class);
//    @Pointcut("execution(* com.industry.bank.service.CustomerService.createRealCustomer(..))")
//    public void logPostCustomerService(){
//
//    }
//
//    @AfterReturning("logPostCustomerService()")
//    public void logAfterPostSucceed(){
//
//    }
//
//    @Around("logPostCustomerService()")
//    public Object firstLogAfterExThPostServiceMethod(ProceedingJoinPoint joinPoint){
//        try {
//            Object o = joinPoint.proceed();
//            // todo
//            return o;
//        } catch (RuntimeException e) {
//            // todo
//            throw e;
//        } catch (Throwable e) {
//            throw new RuntimeException(e);
//        }
//    }
}
