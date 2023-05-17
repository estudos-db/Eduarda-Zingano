package com.example.BibliotecaApi.ServiceImpl;

import com.example.BibliotecaApi.dto.request.AutorRequestDTO;
import com.example.BibliotecaApi.exception.LivroAtribuidoException;
import com.example.BibliotecaApi.exception.NaoEncontradoException;
import com.example.BibliotecaApi.model.Autor;
import com.example.BibliotecaApi.model.Livro;
import com.example.BibliotecaApi.repository.AutorRepository;
import com.example.BibliotecaApi.repository.LivroRepository;
import com.example.BibliotecaApi.service.impl.AutorServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AutorServiceImplTest {
    @InjectMocks
    private AutorServiceImpl autorService;
    @Mock
    private AutorRepository autorRepository;
    @Mock
    private LivroRepository livroRepository;
    private Autor autor;
    private Livro livro;

    @BeforeEach
    void init(){
        atribuicaoDeValores();
    }


    @Test
    void verificaSeSalvaAutor() {
        when(autorRepository.save(any(Autor.class))).thenReturn(autor);


        Autor autorSalvo = autorService.salvar(AutorRequestDTO.builder()
                .nome("Julia Quinn")
                .genero("Feminino")
                .anoNascimento(Year.of(1980))
                .cpf("232425788900")
                .build());

        assertNotNull(autorSalvo);
    }

    @Test
    void verificaSeBuscaAutorPeloNome() {
        when(autorRepository.findByNome("Julia Quinn")).thenReturn(Optional.of(autor));

        Autor autorEncontrado = autorService.buscarAutorPeloNome("Julia Quinn");

        verify(autorRepository,times(1)).findByNome("Julia Quinn");

        assertAll(
                () -> assertNotNull(autorEncontrado),
                () -> assertEquals(autorEncontrado.getNome(), autor.getNome())
        );
    }
    @Test
    void verificaSeRetornaNaoEncontradoExceptionQuandoBuscarAutorQueNaoExiste() {
        when(autorRepository.findByNome("Julia Quinn")).thenThrow(NaoEncontradoException.class);

        assertThrows(NaoEncontradoException.class, () -> autorService.buscarAutorPeloNome("Julia Quinn"), "Autor não encontrado");
    }
    @Test
    void verificaSeDeletaAutorPorId() {
        when(autorRepository.findById(any())).thenReturn(Optional.of(autor));
        autorService.deletarAutorPorId(1L);
        verify(autorRepository,times(1)).findById(1L);
    }
    @Test
    void naoPodeDeletarAutorLivroAtrelado() {
        livro.getAutores().add(autor);
        when(autorRepository.findById(any())).thenReturn(Optional.of(autor));
        when(livroRepository.findByAutoresNome(anyString()).isPresent()).thenThrow(LivroAtribuidoException.class);
        assertThrows(LivroAtribuidoException.class, () -> autorService.deletarAutorPorId(1L),"O autor tem livros atrelados a ele, remova os livros antes de remover autor");
    }

    void atribuicaoDeValores(){
        autor = Autor.builder()
                .id(1L)
                .nome("Julia Quinn")
                .genero("Feminino")
                .anoNascimento(Year.of(1882))
                .cpf("232425788900")
                .build();
        livro = Livro.builder()
                .id(1L)
                .nome("O Visconde que me amava")
                .isbn("32234325049887")
                .dataPublicacao(LocalDate.of(2000,12,05))
                .alugado(false)
                .autores(new ArrayList<>())
                .build();
    }
}
