package com.industry.bank.application.config;

import com.industry.bank.persistence.mapper.UserMapper;
import com.industry.bank.persistence.mapper.UserMapperImpl;
import com.industry.bank.persistence.repository.UserStorageImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.industry.bank.persistence")
public class AppConfig {

    @Bean
    public UserStorageImpl getStorageInstance(){
        return new UserStorageImpl();
    }
    @Bean
    public UserMapper getUserMapperInstance(){
        return new UserMapperImpl();
    }
}
