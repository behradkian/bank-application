package com.industry.bank.application.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.*;

@Slf4j
public class PropertiesFileResourceHelper {

    private final List<String> propertiesResources;
    private final HashMap<String, String> validationMap = new HashMap<>();
    private static final List<String> ignoredParameters;
    private static final List<String> semiIgnoredParameters;

    static {
        semiIgnoredParameters = Collections.unmodifiableList(Arrays.asList("username", "pan"));
        ignoredParameters = Collections.unmodifiableList(Arrays.asList("password", "sessionId", "pin", "cvv2", "expDate"));
    }

    public List<String> getIgnoredParameters() {
        return ignoredParameters;
    }

    public List<String> getSemiIgnoredParameters() {
        return semiIgnoredParameters;
    }

    public PropertiesFileResourceHelper(List<String> propertiesResourceList) {
        this.propertiesResources = propertiesResourceList;
    }

    public HashMap<String, String> getParameterMap() {
        if (validationMap.isEmpty()) {
            for (String singleResource : propertiesResources) {
                final Properties properties;
                try {
                    properties = PropertiesLoaderUtils.loadAllProperties(singleResource);
                } catch (IOException e) {
                    throw new RuntimeException("error on loading properties file", e);
                }
                HashMap<String, String> propertyMap = convertPropertyToMap(properties);
                validationMap.putAll(propertyMap);
            }
        }
        return validationMap;
    }

    private HashMap<String, String> convertPropertyToMap(Properties properties) {
        HashMap<String, String> valueMap = new HashMap<>();
        if (properties == null)
            return valueMap;
        properties.keySet().forEach(key -> valueMap.put((String) key, properties.getProperty((String) key)));
        return valueMap;
    }

}