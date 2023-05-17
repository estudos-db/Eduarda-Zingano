package com.example.BibliotecaApi.dto.response;


import lombok.Builder;
import lombok.Getter;

import java.util.List;
@Getter
@Builder
public class LivroResponseDTO {
    private String nome;
    private boolean alugado;
    private List<AutorResponseDTO> autores;
}

