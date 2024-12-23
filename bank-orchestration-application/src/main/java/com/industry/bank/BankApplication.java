package com.industry.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.FileSystemResource;

@PropertySource(value = "classpath:application.properties", ignoreResourceNotFound = true)
@SpringBootApplication
public class BankApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(BankApplication.class);
        app.run(args);
    }

}
