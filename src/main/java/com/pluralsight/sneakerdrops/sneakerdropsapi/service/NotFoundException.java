package com.pluralsight.sneakerdrops.sneakerdrops.service;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String message){
        super(message);
    }
}
