package com.patterns.solid;

public class InvalidCarException extends Exception{

    private final String message;

    public InvalidCarException (String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
