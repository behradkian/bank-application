package com.industry.bank.api.dto.general;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImageDto {
    private String fileName;
    private String fileType; // e.g., JPEG, PNG, etc.
    private byte[] imageData;
}
