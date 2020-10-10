package com.niranjan.exception.exceptionhandling.mapper;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
