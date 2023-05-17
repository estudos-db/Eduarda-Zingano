package com.example.BibliotecaApi.service;

import com.example.BibliotecaApi.dto.request.AutorRequestDTO;
import com.example.BibliotecaApi.model.Autor;

public interface AutorService {
    Autor salvar(AutorRequestDTO autorCadastrado);
    Autor buscarAutorPeloNome(String nome);
    void deletarAutorPorId(Long id);
}
