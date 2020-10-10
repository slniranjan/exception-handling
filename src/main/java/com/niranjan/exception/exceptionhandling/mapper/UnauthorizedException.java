package com.niranjan.exception.exceptionhandling.mapper;

public class UnauthorizedException extends RuntimeException{

    public UnauthorizedException(String message) {
        super(message);
    }
}
