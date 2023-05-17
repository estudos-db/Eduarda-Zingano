package com.example.BibliotecaApi.service.impl;

import com.example.BibliotecaApi.dto.request.LivroRequestDTO;
import com.example.BibliotecaApi.dto.response.LivroResponseDTO;
import com.example.BibliotecaApi.exception.LivroAlugadoException;
import com.example.BibliotecaApi.exception.NaoEncontradoException;
import com.example.BibliotecaApi.mapper.LivroMapper;
import com.example.BibliotecaApi.model.Autor;
import com.example.BibliotecaApi.model.Livro;
import com.example.BibliotecaApi.repository.AutorRepository;
import com.example.BibliotecaApi.repository.LivroRepository;
import com.example.BibliotecaApi.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.BibliotecaApi.mapper.LivroMapper.toLivro;

@Service
public class LivroServiceImpl implements LivroService {
    private static final String MESSAGE_NOT_FOUND = "Autor não encontrado";
    private final LivroRepository livroRepository;
    private final AutorRepository autorRepository;
    @Autowired
    public LivroServiceImpl(LivroRepository livroRepository, AutorRepository autorRepository) {
        this.livroRepository = livroRepository;
        this.autorRepository = autorRepository;
    }

    @Override
    public Livro salvar(LivroRequestDTO cadastroLivro) {
        List<Autor> entidadesId = autorRepository.findAllById(cadastroLivro.getAutoresId());

        if (entidadesId.isEmpty()){
            throw new NaoEncontradoException(MESSAGE_NOT_FOUND);
        }

        Livro livroEntity = toLivro(cadastroLivro, entidadesId);
        livroRepository.save(livroEntity);

        return livroEntity;
    }

    @Override
    public List<LivroResponseDTO> buscarLivrosDisponiveisParaAlugar() {
        return livroRepository.findByAlugadoFalse().stream().map(LivroMapper::toLivroResponse).toList();
    }

    @Override
    public List<LivroResponseDTO> buscarLivrosAlugados() {
        return livroRepository.findByAlugadoTrue().stream().map(LivroMapper::toLivroResponse).toList();
    }

    @Override
    public Livro buscarLivroPorId(Long id) {
        return livroRepository.findById(id).orElseThrow(() -> new NaoEncontradoException("Livro não encontrado"));
    }

    @Override
    public List<LivroResponseDTO> buscarLivroPorAutor(String nome) {
        return livroRepository.findByAutoresNome(nome).stream().map(LivroMapper::toLivroResponse).toList();
    }

    @Override
    public void deletarLivroPorId(Long id) {
        Livro livroEntity = livroRepository.findById(id).orElseThrow(() -> new NaoEncontradoException(MESSAGE_NOT_FOUND));

        if (livroEntity.isAlugado()){
            throw new LivroAlugadoException("Livro alugado não pode ser deletado");
        }

        livroRepository.deleteById(id);
    }
}
