package com.industry.bank.api.dto.file;

import com.industry.bank.api.enumeration.general.FileExtensionType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "FileDto")
public class FileDto implements Serializable {
    @Schema(name = "data")
    private String data;

    @Schema(name = "type")
    private FileExtensionType type;
}