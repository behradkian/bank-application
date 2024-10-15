package com.industry.bank.api.dto.file;


import com.industry.bank.api.enumeration.general.FileExtensionType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "FileDto" , title = "${FileDto.title}" , description = "${FileDto.description}")
public class FileDto {

    @Schema(name = "data" , title = "${ImageDto.data.title}" , description = "${ImageDto.data.description}")
    private String data;//base64
    @Schema(name = "type" , title = "${ImageDto.type.title}" , description = "${ImageDto.type.description}")
    private FileExtensionType type;

}