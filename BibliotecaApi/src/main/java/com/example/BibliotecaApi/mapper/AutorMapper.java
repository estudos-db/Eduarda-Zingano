package com.example.BibliotecaApi.mapper;

import com.example.BibliotecaApi.dto.request.AutorRequestDTO;
import com.example.BibliotecaApi.dto.response.AutorResponseDTO;
import com.example.BibliotecaApi.model.Autor;

public interface AutorMapper {

    static Autor toAutor(AutorRequestDTO autorCadastrado){
        return Autor.builder()
                .nome(autorCadastrado.getNome())
                .genero(autorCadastrado.getGenero())
                .anoNascimento(autorCadastrado.getAnoNascimento())
                .cpf(autorCadastrado.getCpf())
                .build();
    }
    static AutorResponseDTO toAutor(Autor autor){
        return AutorResponseDTO.builder()
                .nome(autor.getNome())
                .genero(autor.getGenero())
                .anoNascimento(autor.getAnoNascimento())
                .build();
    }
}

