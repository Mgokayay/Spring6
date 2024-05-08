package com.example.spring6.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class PlantErrorResponse {

    private String message;
    private Integer status;
    private Long timestamp;
}
