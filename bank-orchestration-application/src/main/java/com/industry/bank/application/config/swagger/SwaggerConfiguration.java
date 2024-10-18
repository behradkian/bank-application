package com.industry.bank.application.config.swagger;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Configuration
@PropertySource(value = "classpath:documentation/document_fa.properties", encoding = "UTF-8")
public class SwaggerConfiguration {


    @Bean
    public GroupedOpenApi userApi(){
        return GroupedOpenApi.builder()
                .group("user")
                .packagesToScan("com.industry.bank.controller.rest.user")
                .pathsToMatch("/v1/user/**")
                .displayName("user services")
                .build();
    }


    @Bean
    public GroupedOpenApi generalApi(){
        return GroupedOpenApi.builder()
                .group("general")
                .packagesToScan("com.industry.bank.controller.rest.general")
                .pathsToMatch("/v1/general/**")
                .displayName("general services")
                .build();
    }

    @Bean
    public GroupedOpenApi customerApi(){
        return GroupedOpenApi.builder()
                .group("customer")
                .packagesToScan("com.industry.bank.controller.rest.customer")
                .pathsToMatch("/v1/customer/**")
                .displayName("customer services")
                .build();
    }

    @Bean
    public GroupedOpenApi depositApi(){
        return GroupedOpenApi.builder()
                .group("deposit")
                .packagesToScan("com.industry.bank.controller.rest.deposit")
                .pathsToMatch("/v1/deposit/**")
                .displayName("deposit services")
                .build();
    }

}
