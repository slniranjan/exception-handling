package com.niranjan.exception.exceptionhandling.mapper;

public class ResourceAlreadyExists extends RuntimeException{

    public ResourceAlreadyExists(String message) {
        super(message);
    }
}
