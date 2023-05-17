package com.example.BibliotecaApi.service;

import com.example.BibliotecaApi.dto.request.AluguelRequestDTO;
import com.example.BibliotecaApi.dto.response.AluguelResponseDTO;
import com.example.BibliotecaApi.model.Aluguel;

public interface AluguelService {
    Aluguel salvar(AluguelRequestDTO cadastroAluguel);

    AluguelResponseDTO buscarPorId(Long id);

    AluguelResponseDTO buscarPorNomeDoLocador(String nome);

    void deletarAluguel(Long id);
}

