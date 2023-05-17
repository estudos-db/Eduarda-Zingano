package com.example.BibliotecaApi.ServiceImpl;

import com.example.BibliotecaApi.dto.request.AluguelRequestDTO;
import com.example.BibliotecaApi.model.Aluguel;
import com.example.BibliotecaApi.model.Autor;
import com.example.BibliotecaApi.model.Livro;
import com.example.BibliotecaApi.model.Locatario;
import com.example.BibliotecaApi.repository.AluguelRepository;
import com.example.BibliotecaApi.repository.LivroRepository;
import com.example.BibliotecaApi.repository.LocatarioRepository;
import com.example.BibliotecaApi.service.impl.AluguelServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AluguelServiceImplTest {
    @InjectMocks
    private AluguelServiceImpl aluguelService;
    @Mock
    private AluguelRepository aluguelRepository;
    @Mock
    private LivroRepository livroRepository;
    @Mock
    private LocatarioRepository locatarioRepository;

    private Aluguel aluguel;
    private Autor autor;
    private Livro livro;
    private Locatario locatario;

    @BeforeEach
    void init(){
        atribuicaoDeValores();
    }


    @Test
    void verificaSeSalvaUmAluguel(){
        when(livroRepository.findAllById(List.of(1L))).thenReturn(List.of(livro));
        when(locatarioRepository.findById(1L)).thenReturn(Optional.of(locatario));

        aluguelService.salvar(AluguelRequestDTO.builder()
                .idLivros(List.of(1L))
                .idLocatario(1L)
                .build());
    }
    @Test
    void verificaSeBuscaAluguelPorId(){
        when(aluguelRepository.findById(1L)).thenReturn(Optional.of(aluguel));

        aluguelService.buscarPorId(1L);
        verify(aluguelRepository, times(1)).findById(1L);
    }
    @Test
    void verificaSeBuscaAluguelPorNomeDoLocatario(){
        when(aluguelRepository.findByLocatarioNome(anyString())).thenReturn(Optional.of(aluguel));

        aluguelService.buscarPorNomeDoLocador("Eduarda");
        verify(aluguelRepository, times(1)).findByLocatarioNome("Eduarda");
    }
    @Test
    void verificaSeDeletaAluguel(){
        when(aluguelRepository.findById(1L)).thenReturn(Optional.of(aluguel));

        aluguelService.deletarAluguel(1L);
        verify(aluguelRepository, times(1)).findById(1L);
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
                .nome("O Duque e eu")
                .isbn("32425453049887")
                .dataPublicacao(LocalDate.of(2000,01,05))
                .alugado(false)
                .autores(List.of(autor))
                .build();

        locatario = Locatario.builder()
                .id(1L)
                .nome("Eduarda")
                .genero("Não Binário")
                .telefone("343454430")
                .email("eduarda@email.com")
                .dataNascimento(LocalDate.of(2001,12,30))
                .cpf("61077855079")
                .build();

        aluguel = Aluguel.builder()
                .id(1L)
                .dataRetirada(LocalDateTime.now())
                .dataDevolucao(LocalDateTime.now().withHour(20))
                .livros(List.of(livro))
                .locatario(locatario)
                .build();
    }

}

