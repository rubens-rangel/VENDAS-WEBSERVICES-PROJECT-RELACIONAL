package com.example.demo.services.exceptions;

public class DatabaseException extends RuntimeException{
    public static final long serialVersionUID = 1L;

    public DatabaseException(String msg){
        super(msg);
    }

}
