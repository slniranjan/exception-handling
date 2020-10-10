package com.niranjan.exception.resource;

import com.niranjan.exception.exceptionhandling.mapper.CustomException;
import com.niranjan.exception.exceptionhandling.mapper.ResourceAlreadyExists;
import com.niranjan.exception.exceptionhandling.mapper.ResourceNotFoundException;
import com.niranjan.exception.exceptionhandling.mapper.UnauthorizedException;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping(value = "/testExceptionHandling")
    public String testExceptionHandling(@RequestParam int code) {
        switch (code) {
            case 401:
                throw new UnauthorizedException("You are not authorized");
            case 404:
                throw new ResourceNotFoundException("Requested resource is not found.");
            case 400:
                throw new CustomException("Please provide resource id.");
            case 409:
                throw new ResourceAlreadyExists("Resource already exists in DB.");
            default:
                return "Yeah...No Exception.";
        }
    }
}
