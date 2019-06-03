package com.example.demo.exception;

public class DataException extends Exception {
    public DataException(){

    }
    public DataException(String message){
        super(message);
    }
    public DataException(Throwable cause){
        super(cause);
    }
    public DataException(String message, Throwable cause) {
        super(message, cause);
    }
}
