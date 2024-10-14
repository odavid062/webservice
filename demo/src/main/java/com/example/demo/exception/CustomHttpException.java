package com.example.demo.exception;

public class CustomHttpException extends RuntimeException {
    public CustomHttpException(String message) {
        super(message);
    }
}
