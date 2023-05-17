package com.example.BibliotecaApi.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
public class ListaLivrosDoAutorResponseDTO {

        private String nome;
        private String isbn;
        private LocalDate dataPublicacao;


}
