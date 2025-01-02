package com.industry.bank.application.config.swagger;

import com.google.common.io.Resources;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SwaggerUtil {

    public static String getMarkDownFileContent(String filePath) {

        String content;
        try {
            final URL url = SwaggerUtil.class.getClassLoader().getResource(filePath);
            content = Resources.toString(url, StandardCharsets.UTF_8);
        } catch (IOException | IllegalArgumentException e) {
            content = String.format("Markdown file %s not loaded", filePath);
        }
        return content;
    }
}