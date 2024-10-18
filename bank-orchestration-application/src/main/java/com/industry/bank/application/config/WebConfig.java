package com.industry.bank.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//todo after checking
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//
//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/api/**")
//                        .allowedOrigins("http://localhost:4200/") // Set the specific allowed origin
//                        .allowedMethods("GET", "POST", "PUT", "DELETE") // Set allowed HTTP methods
//                        .allowedHeaders("*") // Allow all headers
//                        .allowCredentials(true) // Allow sending of credentials (e.g., cookies)
//                        .maxAge(3600); // Cache the response for 1 hour
//            }
//        };
//    }
//}