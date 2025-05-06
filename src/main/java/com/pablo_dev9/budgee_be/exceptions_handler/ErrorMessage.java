package com.pablo_dev9.budgee_be.exceptions_handler;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor

public class ErrorMessage {

    private String exception;
    private String message;
    private String path;

    public ErrorMessage(Exception exception, String path){
        this.exception = exception.getClass().getSimpleName();
        this.message = exception.getMessage();
        this.path = path;
    }


}
