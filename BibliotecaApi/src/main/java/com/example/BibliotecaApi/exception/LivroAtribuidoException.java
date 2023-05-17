package com.example.BibliotecaApi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT)
public class LivroAtribuidoException extends RuntimeException{

    public LivroAtribuidoException(String msg){
        super(msg);
    }
}
