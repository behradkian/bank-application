package com.industry.bank.application.config.swagger;

import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.media.Content;
import io.swagger.v3.oas.models.media.MediaType;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.customizers.OperationCustomizer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;

import java.util.Map;


@Component
@Slf4j
public class ExceptionFileOperationCustomizer implements OperationCustomizer {

    @Value("${document.lang}")
    private String locale;

    private static final String ERROR_FILE_PATH = "documentation/md/error";
    private static final String HTTP_SERVER_EXCEPTION_REF = "#/components/schemas/HttpServerException";

    @Override
    public Operation customize(Operation operation, HandlerMethod handlerMethod) {
        ApiResponses responses = operation.getResponses();
        for (Map.Entry<String, ApiResponse> responseEntry : responses.entrySet()) {
            ApiResponse value = responseEntry.getValue();
            String description = value.getDescription();
            Content content = value.getContent();
            addServerExceptionSchema(responseEntry.getKey(), content);
            if (description != null && description.startsWith("md:")) {
                description = getMdFileContent(description.replace("md:", ""));
                value.setDescription(description);
            }
        }
        addInternalServerErrorResponse(responses);
        return operation;
    }

    private void addInternalServerErrorResponse(ApiResponses responses) {
        ApiResponse item = new ApiResponse();
        String description = "";
        if (responses.get("500") != null) {
            description = responses.get("500").getDescription();
        }
        item.setDescription(description + getMdFileContent("ServerError.md"));
        Content content = new Content();
        MediaType mediaType = new MediaType();
        content.put("application/json", mediaType);
        mediaType.setSchema(new Schema());
        addServerExceptionSchema("500", content);
        item.setContent(content);
        responses.addApiResponse("500", item);
    }

    private String getMdFileContent(String mdFileName) {
        return SwaggerUtil.getMarkDownFileContent(ERROR_FILE_PATH + "/" + locale + "/" + mdFileName);
    }

    private void addServerExceptionSchema(String code, Content content) {
        if (content != null && (code.startsWith("4") || code.startsWith("5"))) {
            content.get("application/json").getSchema().set$ref(HTTP_SERVER_EXCEPTION_REF);
        }
    }
}