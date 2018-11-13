package com.at.learning.exception.dto;

public class ExceptionResponse {

    public String message;

    public ExceptionResponse(Exception exception) {
        message = exception.getMessage();
    }
}
