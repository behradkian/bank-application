package com.industry.bank.api.dto.file;


import com.industry.bank.api.enumeration.general.FileExtensionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileDto {

    private String data;//base64
    private FileExtensionType type;

}
