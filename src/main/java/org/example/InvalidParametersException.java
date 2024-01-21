package org.example;

public class InvalidParametersException extends RuntimeException{
    public InvalidParametersException() {
    }

    public InvalidParametersException(String message) {
        super(message);
    }
}
