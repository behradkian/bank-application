package com.industry.bank.application.config.swagger;

import com.google.common.io.Resources;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SwaggerUtil {

    public static String getMarkDownFileContent(String filePath) {

        String content = null;
        try {
            final URL url = SwaggerUtil.class.getClassLoader().getResource(filePath);
            content = Resources.toString(Objects.requireNonNull(url), StandardCharsets.UTF_8);
        } catch (IOException | IllegalArgumentException e) {
            log.error("Markdown file {} not loaded, exceptionType is : {}, exceptionMessage is : {}", filePath, e.getClass().getSimpleName(), e.getMessage());
        }
        return content;
    }
}