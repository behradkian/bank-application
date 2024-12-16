package com.industry.bank.application.config;

import com.industry.bank.persistence.mapper.UserMapper;
import com.industry.bank.persistence.mapper.UserMapperImpl;
import com.industry.bank.persistence.repository.UserStorageImpl;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import java.util.Arrays;
import java.util.Locale;

@Configuration
public class AppConfig {

    @Bean
    public UserStorageImpl getStorageInstance(){
        return new UserStorageImpl();
    }
    @Bean
    public UserMapper getUserMapperInstance(){
        return new UserMapperImpl();
    }

    @Bean
    public LocaleResolver localeResolver() {
        AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
        localeResolver.setSupportedLocales(Arrays.asList(new Locale("fa"), new Locale("en")));
        localeResolver.setDefaultLocale(new Locale("fa"));
        return localeResolver;
    }

    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasenames("classpath:documentation");
        messageSource.setDefaultEncoding("UTF-8");
        messageSource.setUseCodeAsDefaultMessage(true);
        return messageSource;
    }
}
