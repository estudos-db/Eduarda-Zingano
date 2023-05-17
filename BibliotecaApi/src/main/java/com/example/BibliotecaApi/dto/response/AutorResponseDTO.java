package com.example.BibliotecaApi.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.time.Year;
@Getter
@Builder
public class AutorResponseDTO {
    private String nome;
    private String genero;
    private Year anoNascimento;
}

