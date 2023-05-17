package com.example.BibliotecaApi.service.impl;

import com.example.BibliotecaApi.dto.request.AtualizarLocatarioRequestDTO;
import com.example.BibliotecaApi.dto.request.CadastraLocatarioRequestDTO;
import com.example.BibliotecaApi.exception.AluguelException;
import com.example.BibliotecaApi.exception.NaoEncontradoException;
import com.example.BibliotecaApi.mapper.LocatarioMapper;
import com.example.BibliotecaApi.model.Locatario;
import com.example.BibliotecaApi.repository.AluguelRepository;
import com.example.BibliotecaApi.repository.LocatarioRepository;
import com.example.BibliotecaApi.service.LocatarioService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.BibliotecaApi.mapper.LocatarioMapper.toLocatarioResponse;

@Service
public class LocatarioServiceImpl implements LocatarioService {
    private static final String MESSAGE_NOT_FOUND = "Locatario não encontrado";

    private final LocatarioRepository locatarioRepository;
    private final AluguelRepository aluguelRepository;
    @Autowired
    public LocatarioServiceImpl(LocatarioRepository locatarioRepository, AluguelRepository aluguelRepository) {
        this.locatarioRepository = locatarioRepository;
        this.aluguelRepository = aluguelRepository;
    }

    public Locatario salvar(CadastraLocatarioRequestDTO locatarioCadastrado) {
        Locatario locatario = LocatarioMapper.toLocatarioResponse(locatarioCadastrado);
        locatarioRepository.save(locatario);
        return locatario;
    }

    @Override
    public Locatario buscarLocatarioPorId(Long id) {
        return locatarioRepository.findById(id).orElseThrow(() -> new NaoEncontradoException(MESSAGE_NOT_FOUND));
    }

    @Override
    public Locatario buscarLocatarioPeloNome(String nome) {
        return locatarioRepository.findByNome(nome).orElseThrow(() -> new NaoEncontradoException(MESSAGE_NOT_FOUND));
    }

    @Transactional
    public Locatario editar(Long id, AtualizarLocatarioRequestDTO locatario) {
        Locatario locatarioEntity = locatarioRepository.findById(id).orElseThrow(() -> new NaoEncontradoException(MESSAGE_NOT_FOUND));
        return toLocatarioResponse(locatarioEntity, locatario);
    }

    @Override
    public void deletar(Long id) {
        Locatario locatario = locatarioRepository.findById(id)
                .orElseThrow(() -> new NaoEncontradoException((MESSAGE_NOT_FOUND)));
        aluguelRepository.findByLocatarioNome(locatario.getNome())
                .ifPresent(v ->{throw new AluguelException("Locatario não pode ser excluido pois esta alugando livros");});

        locatarioRepository.deleteById(id);
    }
}

