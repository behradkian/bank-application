package com.industry.bank.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = "classpath:application.properties", ignoreResourceNotFound = true)
@ComponentScan(basePackages = {"com.industry.bank.application", "com.industry.bank.api", "com.industry.bank.controller", "com.industry.bank.service"})
@SpringBootApplication
public class BankApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankApplication.class, args);
    }

}
