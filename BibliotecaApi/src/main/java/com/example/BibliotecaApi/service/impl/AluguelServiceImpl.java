package com.example.BibliotecaApi.service.impl;

import com.example.BibliotecaApi.dto.request.AluguelRequestDTO;
import com.example.BibliotecaApi.dto.response.AluguelResponseDTO;
import com.example.BibliotecaApi.exception.NaoEncontradoException;
import com.example.BibliotecaApi.model.Aluguel;
import com.example.BibliotecaApi.model.Livro;
import com.example.BibliotecaApi.model.Locatario;
import com.example.BibliotecaApi.repository.AluguelRepository;
import com.example.BibliotecaApi.repository.LivroRepository;
import com.example.BibliotecaApi.repository.LocatarioRepository;
import com.example.BibliotecaApi.service.AluguelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.BibliotecaApi.mapper.AluguelMapper.toAluguel;
import static com.example.BibliotecaApi.mapper.AluguelMapper.toAluguelResponse;

@Service
public class AluguelServiceImpl implements AluguelService {
    private static final String MESSAGE_NOT_FOUND = "Locatário não foi localizado";

    private final AluguelRepository aluguelRepository;
    private final LocatarioRepository locatarioRepository;
    private final LivroRepository livroRepository;


    @Autowired
    public AluguelServiceImpl(AluguelRepository aluguelRepository, LocatarioRepository locatarioRepository, LivroRepository livroRepository) {
        this.aluguelRepository = aluguelRepository;
        this.locatarioRepository = locatarioRepository;
        this.livroRepository = livroRepository;
    }

    @Override
    public Aluguel salvar(AluguelRequestDTO cadastroAluguel) {
        List<Livro> livrosAchados = livroRepository.findAllById(cadastroAluguel.getIdLivros());

        if (livrosAchados.isEmpty()){
            throw new NaoEncontradoException("Livro não encontrado");
        }

        livrosAchados.forEach(v -> v.setAlugado(true));

        Locatario locatarioEncontrado = locatarioRepository.findById(cadastroAluguel.getIdLocatario())
                .orElseThrow(() -> new NaoEncontradoException(MESSAGE_NOT_FOUND));

        Aluguel aluguel = toAluguel(livrosAchados, locatarioEncontrado);
        aluguelRepository.save(aluguel);

        return aluguel;
    }

    @Override
    public AluguelResponseDTO buscarPorId(Long id) {
        Aluguel aluguel = aluguelRepository.findById(1L).orElseThrow(() -> new NaoEncontradoException("Aluguel não encontrado"));
        return toAluguelResponse(aluguel);
    }

    @Override
    public AluguelResponseDTO buscarPorNomeDoLocador(String nome) {
        Aluguel aluguel = aluguelRepository.findByLocatarioNome(nome)
                .orElseThrow(() -> new NaoEncontradoException(MESSAGE_NOT_FOUND));
        return toAluguelResponse(aluguel);
    }

    @Override
    public void deletarAluguel(Long id) {
        Aluguel aluguel = aluguelRepository.findById(id)
                .orElseThrow(() -> new NaoEncontradoException(MESSAGE_NOT_FOUND));

        aluguel.getLivros().forEach(v -> v.setAlugado(false));

        aluguelRepository.delete(aluguel);
    }
}
