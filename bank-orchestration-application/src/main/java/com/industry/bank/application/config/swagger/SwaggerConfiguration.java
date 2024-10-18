package com.industry.bank.application.config.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Configuration
@PropertySource(value = "classpath:documentation/document_${document.lang}.properties", encoding = "UTF-8")
public class SwaggerConfiguration {

    @Value("${spring.application.name}")
    private String appTitle;

    @Value("${app.version}")
    private String appVersion;

    @Bean
    public OpenAPI swaggerApi(){
        return new OpenAPI().info(new Info()
                .title(appTitle)
                .description("سرویس های مرتبط با بانک")
                .version(appVersion));
    }

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
                .displayName("general services")
                .build();
    }

    @Bean
    public GroupedOpenApi customerApi(){
        return GroupedOpenApi.builder()
                .group("customer")
                .packagesToScan("com.industry.bank.controller.rest.customer")
                .displayName("customer services")
                .build();
    }

    @Bean
    public GroupedOpenApi depositApi(){
        return GroupedOpenApi.builder()
                .group("deposit")
                .packagesToScan("com.industry.bank.controller.rest.deposit")
                .displayName("deposit services")
                .build();
    }

}
