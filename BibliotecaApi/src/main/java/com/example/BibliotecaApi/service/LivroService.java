package com.example.BibliotecaApi.service;

import com.example.BibliotecaApi.dto.request.LivroRequestDTO;
import com.example.BibliotecaApi.dto.response.LivroResponseDTO;
import com.example.BibliotecaApi.model.Livro;

import java.util.List;

public interface LivroService {
    Livro salvar(LivroRequestDTO cadastroLivro);
    List<LivroResponseDTO> buscarLivrosDisponiveisParaAlugar();
    List<LivroResponseDTO> buscarLivrosAlugados();
    Livro buscarLivroPorId(Long id);
    List<LivroResponseDTO> buscarLivroPorAutor(String nome);
    void deletarLivroPorId(Long id);
}
