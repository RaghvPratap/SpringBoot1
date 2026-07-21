package com.raghv.demo.StudentServer.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
public class ExceptionResponseDTO {
    private LocalDateTime timestamp;
    private  int statusCode;
    private String error;
    private String path;



    public ExceptionResponseDTO(LocalDateTime now, int value, String reasonPhrase, String message, String requestURI) {
    }
}
