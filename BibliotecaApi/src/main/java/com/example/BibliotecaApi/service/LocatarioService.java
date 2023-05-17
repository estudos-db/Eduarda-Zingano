package com.example.BibliotecaApi.service;


import com.example.BibliotecaApi.dto.request.AtualizarLocatarioRequestDTO;
import com.example.BibliotecaApi.dto.request.CadastraLocatarioRequestDTO;
import com.example.BibliotecaApi.model.Locatario;

public interface LocatarioService {

    Locatario salvar(CadastraLocatarioRequestDTO locatarioCadastrado);

    Locatario buscarLocatarioPorId(Long id);

    Locatario buscarLocatarioPeloNome(String nome);

    Locatario editar(Long id, AtualizarLocatarioRequestDTO locatario);

    void deletar(Long id);
}

