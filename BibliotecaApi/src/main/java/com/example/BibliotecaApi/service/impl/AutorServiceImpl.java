package com.example.BibliotecaApi.service.impl;

import com.example.BibliotecaApi.dto.request.AutorRequestDTO;
import com.example.BibliotecaApi.exception.LivroAtribuidoException;
import com.example.BibliotecaApi.exception.NaoEncontradoException;
import com.example.BibliotecaApi.model.Autor;
import com.example.BibliotecaApi.repository.AutorRepository;
import com.example.BibliotecaApi.repository.LivroRepository;
import com.example.BibliotecaApi.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.BibliotecaApi.mapper.AutorMapper.toAutor;

@Service
public class AutorServiceImpl implements AutorService {
    private static  final String MESSAGE_NOT_FOUND = "Autor não encontrado";

    private final AutorRepository autorRepository;
    private final LivroRepository livroRepository;
    @Autowired
    public AutorServiceImpl(AutorRepository autorRepository, LivroRepository livroRepository) {
        this.autorRepository = autorRepository;
        this.livroRepository = livroRepository;
    }

    @Override
    public Autor salvar(AutorRequestDTO autorCadastrado) {
        Autor autorEntity = toAutor(autorCadastrado);
        autorRepository.save(autorEntity);
        return autorEntity;
    }

    @Override
    public Autor buscarAutorPeloNome(String nome) {
        return autorRepository.findByNome(nome)
                .orElseThrow(() -> new NaoEncontradoException(MESSAGE_NOT_FOUND));
    }

    @Override
    public void deletarAutorPorId(Long id) {
        Autor autor = autorRepository.findById(id)
                .orElseThrow(() -> new NaoEncontradoException(MESSAGE_NOT_FOUND));

        livroRepository.findByAutoresNome(autor.getNome())
                .ifPresent(v -> {throw new LivroAtribuidoException("O autor tem livros atrelados a ele, remova os livros antes de remover autor");});

        autorRepository.deleteById(id);
    }
}

