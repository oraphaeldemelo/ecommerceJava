package com.example.ecommerce.api.exceptions;

public class ErrorResponse {
    private String errorCode;
    private String message;

    public ErrorResponse(String error, String message) {
        this.errorCode = error;
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }
    public String getMessage() {
        return message;
    }
}
