package com.ejercicio3.Banco.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException( ) {
        super();
    }
    public ResourceNotFoundException(String message ) {
        super(message);
    }
}

