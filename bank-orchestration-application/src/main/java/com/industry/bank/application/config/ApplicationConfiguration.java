//package com.industry.bank.application.config;
//
//import com.tosan.loan.origin.orchestration.application.util.PropertiesFileResourceHelper;
//import com.tosan.loan.origin.orchestration.invoker.core.config.CoreType;
//import com.tosan.loan.origin.orchestration.service.DefaultFileServiceImpl;
//import com.tosan.loan.origin.orchestration.service.FileServiceImpl;
//import com.tosan.loan.origin.orchestration.service.api.FileService;
//import com.tosan.validation.Validation;
//import com.tosan.validation.core.ValidatorBuilder;
//import lombok.Setter;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.context.MessageSource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.support.ReloadableResourceBundleMessageSource;
//import org.springframework.web.servlet.LocaleResolver;
//import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Locale;
//
//
//@Configuration
//@Setter
//public class ApplicationConfiguration {
//
//    protected static final String DEFAULT_VALIDATION_PROPERTIES_PATH = "validation/validation-default.properties";
//    protected static final String NEGIN_VALIDATION_PROPERTIES_PATH = "validation/validation-negin.properties";
//    protected static final String BANCO_VALIDATION_PROPERTIES_PATH = "validation/validation-banco.properties";
//
//    @Value("${core.type}")
//    private CoreType coreType;
//
//    @ConditionalOnProperty(value = "tdms.enabled", havingValue = "false")
//    @Bean
//    public FileService fileService() {
//        return new DefaultFileServiceImpl();
//    }
//
//    @Bean
//    public LocaleResolver localeResolver() {
//        AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
//        localeResolver.setSupportedLocales(Arrays.asList(new Locale("fa"), new Locale("en")));
//        localeResolver.setDefaultLocale(new Locale("fa"));
//        return localeResolver;
//    }
//
//    @Bean
//    public MessageSource messageSource() {
//        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
//        messageSource.setBasenames("classpath:documentation/documentation");
//        messageSource.setDefaultEncoding("UTF-8");
//        messageSource.setUseCodeAsDefaultMessage(true);
//        return messageSource;
//    }
//
//    @Bean
//    public Validation validation(ValidatorBuilder validatorBuilder,
//                                 PropertiesFileResourceHelper propertiesFileResourceHelper) {
//        Validation validation = new Validation(validatorBuilder, propertiesFileResourceHelper.getParameterMap());
//        validation.setIgnoredParameters(propertiesFileResourceHelper.getIgnoredParameters());
//        validation.setSemiIgnoredParameters(propertiesFileResourceHelper.getSemiIgnoredParameters());
//        return validation;
//    }
//
//    @Bean
//    public ValidatorBuilder validatorBuilder(PropertiesFileResourceHelper propertiesFileResourceHelper) {
//        return new ValidatorBuilder(propertiesFileResourceHelper.getParameterMap());
//    }
//
//    @Bean
//    public PropertiesFileResourceHelper propertiesFileResourceHelper() {
//        List<String> resources = createResourcePropertiesList();
//        return new PropertiesFileResourceHelper(resources);
//    }
//
//    protected List<String> createResourcePropertiesList() {
//        List<String> resources = new ArrayList<>();
//        resources.add(DEFAULT_VALIDATION_PROPERTIES_PATH);
//        if (coreType.equals(CoreType.NEGIN_LITE)) {
//            resources.add(NEGIN_VALIDATION_PROPERTIES_PATH);
//        } else if (coreType.equals(CoreType.BANCO_HTTP)) {
//            resources.add(BANCO_VALIDATION_PROPERTIES_PATH);
//        }
//        return resources;
//    }
//
//}
