package com.knoldus.fullstack.springboot.jwt.basic.authentication.jwt;

public class AuthenticationException extends RuntimeException {
    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }
}

