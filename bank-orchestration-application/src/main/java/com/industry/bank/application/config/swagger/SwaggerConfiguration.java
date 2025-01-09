package com.industry.bank.application.config.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@RequiredArgsConstructor
@Configuration
@PropertySource(value = "classpath:documentation/document_${document.lang}.properties", encoding = "UTF-8")
public class SwaggerConfiguration {

    @Value("${BankOrchestrationApplication}")
    private String appTitle;

    @Value("${app.version}")
    private String appVersion;

    @Value("${BankOrchestrationApplication_description}")
    private String appDescription;

    @Bean
    public OpenAPI swaggerApi(){
        return new OpenAPI().info(new Info()
                .title(appTitle)
                .description(appDescription)
                .version(appVersion));
    }

    @Bean
    public GroupedOpenApi userApi(){
        return GroupedOpenApi.builder()
                .group("user")
                .pathsToMatch("/user/**")
                .packagesToScan("com.industry.bank.controller.rest.user")
                .displayName("user services")
                .build();
    }

    @Bean
    public GroupedOpenApi generalApi(){
        return GroupedOpenApi.builder()
                .group("general")
                .pathsToMatch("/general/**")
                .packagesToScan("com.industry.bank.controller.rest.general")
                .displayName("general services")
                .build();
    }

    @Bean
    public GroupedOpenApi customerApi(){
        return GroupedOpenApi.builder()
                .group("customer")
                .pathsToMatch("/customer/**")
                .packagesToScan("com.industry.bank.controller.rest.customer")
                .displayName("customer services")
                .build();
    }

    @Bean
    public GroupedOpenApi depositApi(){
        return GroupedOpenApi.builder()
                .group("deposit")
                .pathsToMatch("/deposit/**")
                .packagesToScan("com.industry.bank.controller.rest.deposit")
                .displayName("deposit services")
                .build();
    }
}