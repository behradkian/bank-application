package com.industry.bank.application.config.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import lombok.RequiredArgsConstructor;
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

    @Value("${BankOrchestrationApplication_DESC}")
    private String appDescription;


    @Bean
    public OpenAPI swaggerApi(){
        return new OpenAPI().info(new Info()
                .title(appTitle)
                .description(appDescription)
                .version(appVersion));
    }
}
