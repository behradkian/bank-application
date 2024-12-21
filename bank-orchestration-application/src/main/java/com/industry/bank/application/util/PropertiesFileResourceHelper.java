package com.industry.bank.application.util;

import com.industry.bank.api.exception.checked.BankException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.*;


public class PropertiesFileResourceHelper {

    private final static Logger logger = LoggerFactory.getLogger(PropertiesFileResourceHelper.class);
    private final List<String> propertiesResources;
    private HashMap<String, String> validationKeyValueMap = new HashMap<>();

    public PropertiesFileResourceHelper(List<String> propertiesResourceList) {
        this.propertiesResources = propertiesResourceList;
    }

    public HashMap<String, String> getParameterMap() throws BankException {
        if (validationKeyValueMap.isEmpty()) {
            for (String singleResource : propertiesResources) {
                final Properties properties;
                try {
                    properties = PropertiesLoaderUtils.loadAllProperties(singleResource);
                } catch (IOException e) {
                    throw new BankException("error on loading properties file", e);
                }
                HashMap<String, String> propertyMap = convertPropertyToMap(properties);
                validationKeyValueMap.putAll(propertyMap);
            }
        }
        return validationKeyValueMap;
    }

    private static final List<String> ignoredParameters;

    static {
        ignoredParameters=Collections.unmodifiableList(Arrays.asList( "password","sessionId","pin","cvv2","expDate"));
    }

    public List<String> getIgnoredParameters() {
        return ignoredParameters;
    }

    private static final List<String> semiIgnoredParameters;

    static {
        semiIgnoredParameters = Collections.unmodifiableList(Arrays.asList("username","pan"));
    }

    public List<String> getSemiIgnoredParameters() {

        return semiIgnoredParameters;
    }

    private HashMap<String, String> convertPropertyToMap(Properties properties) {
        HashMap<String, String> valueMap = new HashMap<>();
        if (properties == null) {
            return valueMap;
        }
        properties.keySet().forEach(key -> valueMap.put((String) key, properties.getProperty((String) key)));
        return valueMap;
    }
}
