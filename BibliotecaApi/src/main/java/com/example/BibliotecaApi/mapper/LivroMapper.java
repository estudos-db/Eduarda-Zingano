package com.example.BibliotecaApi.mapper;

import com.example.BibliotecaApi.dto.request.LivroRequestDTO;
import com.example.BibliotecaApi.dto.response.ListaLivrosDoAutorResponseDTO;
import com.example.BibliotecaApi.dto.response.LivroResponseDTO;
import com.example.BibliotecaApi.model.Autor;
import com.example.BibliotecaApi.model.Livro;

import java.util.List;

public interface LivroMapper {
    static Livro toLivro(LivroRequestDTO cadastroLivro, List<Autor> entidadesId) {
        return Livro.builder()
                .nome(cadastroLivro.getNome())
                .isbn(cadastroLivro.getIsbn())
                .autores(entidadesId)
                .dataPublicacao(cadastroLivro.getDataPublicacao())
                .build();
    }
    static ListaLivrosDoAutorResponseDTO toLivro(Livro livro){
        return ListaLivrosDoAutorResponseDTO.builder()
                .nome(livro.getNome())
                .isbn(livro.getIsbn())
                .dataPublicacao(livro.getDataPublicacao())
                .build();
    }
    static LivroResponseDTO toLivroResponse(Livro livro){
        return LivroResponseDTO
                .builder()
                .nome(livro.getNome())
                .alugado(livro.isAlugado())
                .autores(livro.getAutores().stream().map(AutorMapper::toAutor).toList())
                .build();
    }
}

