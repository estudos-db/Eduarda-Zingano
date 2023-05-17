package com.example.BibliotecaApi.ServiceImpl;

import com.example.BibliotecaApi.dto.request.LivroRequestDTO;
import com.example.BibliotecaApi.exception.LivroAlugadoException;
import com.example.BibliotecaApi.model.Autor;
import com.example.BibliotecaApi.model.Livro;
import com.example.BibliotecaApi.repository.AutorRepository;
import com.example.BibliotecaApi.repository.LivroRepository;
import com.example.BibliotecaApi.service.impl.LivroServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.time.Year;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class LivroServiceImplTest {

    @InjectMocks
    private LivroServiceImpl livroService;
    @Mock
    private LivroRepository livroRepository;
    @Mock
    private AutorRepository autorRepository;
    private Livro livro;
    private Autor autor;

    @BeforeEach
    void init(){
       atribuicaoDeValores();
    }

    @Test
    void verificaSeSalvaLivro(){
        when(autorRepository.findAllById(List.of(1L))).thenReturn(List.of(autor));
        when(livroRepository.save(any(Livro.class))).thenReturn(livro);

        livroService.salvar(LivroRequestDTO.builder()
                .nome("Um Perfeito cavalheiro")
                .isbn("9788525044297")
                .dataPublicacao(LocalDate.of(2001,07,03))
                .autoresId(List.of(1L))
                .build());
    }

    @Test
    void VerificaSeRetornaLivrosNaoAlugados(){
        when(livroRepository.findByAlugadoFalse()).thenReturn(List.of(livro));

        livroService.buscarLivrosDisponiveisParaAlugar();

        verify(livroRepository, times(1)).findByAlugadoFalse();
    }
    @Test
    void verificaSeRetornaLivrosAlugados(){
        when(livroRepository.findByAlugadoTrue()).thenReturn(List.of(livro));

        livroService.buscarLivrosAlugados();

        verify(livroRepository, times(1)).findByAlugadoTrue();
    }
    @Test
    void verificaSeRetornaLivrosEscritoPorAutores(){
        when(livroRepository.findByAutoresNome(anyString())).thenReturn(Optional.of(livro));

        livroService.buscarLivroPorAutor("Um Perfeito cavalheiro");
        verify(livroRepository, times(1)).findByAutoresNome("Um Perfeito cavalheiro");
    }
    @Test
    void verificaSeRetornaLivrosPorId(){
        when(livroRepository.findById(anyLong())).thenReturn(Optional.of(livro));

        livroService.buscarLivroPorId(1L);
    }

    @Test
    void verificaSeDeletaLivro(){
        when(livroRepository.findById(anyLong())).thenReturn(Optional.of(livro));

        livroService.deletarLivroPorId(1L);
    }

    @Test
    void verificaSeNaoDeletaLivroAlugado(){
        when(livroRepository.findById(anyLong())).thenReturn(Optional.of(livro));
        livro.setAlugado(true);

        assertThrows(LivroAlugadoException.class, () -> livroService.deletarLivroPorId(1L));
    }

    void atribuicaoDeValores(){
        autor = Autor.builder()
                .id(1L)
                .nome("Julia Quinn")
                .genero("Feminino")
                .anoNascimento(Year.of(1980))
                .cpf("232425788900")
                .build();

        livro = Livro.builder()
                .id(1L)
                .nome("Um Perfeito cavalheiro")
                .isbn("9788525044297")
                .dataPublicacao(LocalDate.of(2020,11,11))
                .autores(List.of(autor))
                .build();
    }
}

