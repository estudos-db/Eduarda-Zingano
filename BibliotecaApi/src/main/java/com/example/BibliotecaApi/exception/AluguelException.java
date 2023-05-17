package com.example.BibliotecaApi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT)
public class AluguelException extends RuntimeException {

    public AluguelException(String msg){
        super(msg);
    }
}
