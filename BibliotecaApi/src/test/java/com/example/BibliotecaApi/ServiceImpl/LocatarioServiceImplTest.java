package com.example.BibliotecaApi.ServiceImpl;

import com.example.BibliotecaApi.dto.request.AtualizarLocatarioRequestDTO;
import com.example.BibliotecaApi.dto.request.CadastraLocatarioRequestDTO;
import com.example.BibliotecaApi.exception.AluguelException;
import com.example.BibliotecaApi.exception.NaoEncontradoException;
import com.example.BibliotecaApi.model.Locatario;
import com.example.BibliotecaApi.repository.AluguelRepository;
import com.example.BibliotecaApi.repository.LocatarioRepository;
import com.example.BibliotecaApi.service.impl.LocatarioServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class LocatarioServiceImplTest {
    @InjectMocks
    private LocatarioServiceImpl locatarioService;
    @Mock
    private LocatarioRepository locatarioRepository;
    @Mock
    private AluguelRepository aluguelRepository;
    private Locatario locatario;

    @BeforeEach
    void init(){
        locatario = Locatario.builder()
                .id(1L)
                .nome("Eduarda")
                .genero("Não Binário")
                .telefone("3454698709")
                .email("eduarda@email.com")
                .dataNascimento(LocalDate.of(2001,12,30))
                .cpf("61077855079")
                .build();
    }
    @Test
    void deveCadastrarLocatario(){
        when(locatarioRepository.save(any(Locatario.class))).thenReturn(locatario);

        locatarioService.salvar(CadastraLocatarioRequestDTO.builder().nome("Eduarda")
                .genero("Não Binário")
                .telefone("3454698709")
                .email("eduarda@email.com")
                .dataNascimento(LocalDate.of(2001,12,30))
                .cpf("61077855079")
                .build());

    }
    @Test
    void verificaSeRetornaLocatarioPorId(){
        when(locatarioRepository.findById(anyLong())).thenReturn(Optional.of(locatario));

        locatarioService.buscarLocatarioPorId(1L);

        verify(locatarioRepository, times(1)).findById(1L);
    }
    @Test
    void verificaSeRetornaExcecaoAoBuscarLocatarioNaoExistentePorId(){
        when(locatarioRepository.findById(anyLong())).thenThrow(NaoEncontradoException.class);

        assertThrows(NaoEncontradoException.class, () -> locatarioService.buscarLocatarioPorId(1L));
    }
    @Test
    void verificaSeRetornaLocatarioAoBuscarPeloNome(){
        when(locatarioRepository.findByNome(anyString())).thenReturn(Optional.of(locatario));

        locatarioService.buscarLocatarioPeloNome("Eduarda");

        verify(locatarioRepository, times(1)).findByNome("Eduarda");
    }
    @Test
    void verificaSeRetornaExcecaoAoBuscarLocatarioNaoExistentePeloNome(){
        when(locatarioRepository.findByNome(anyString())).thenThrow(NaoEncontradoException.class);

        assertThrows(NaoEncontradoException.class, () -> locatarioService.buscarLocatarioPeloNome("Eduarda"));
    }
    @Test
    void verificaSeEditaLocatario(){
        when(locatarioRepository.findById(anyLong())).thenReturn(Optional.of(locatario));

        locatarioService.editar(1L, AtualizarLocatarioRequestDTO.builder()
                .nome("Eduarda")
                .genero("Não Binário")
                .telefone("345569809")
                .email("eduarda@email.com")
                .dataNascimento(LocalDate.of(2001,12,29))
                .build());

        verify(locatarioRepository, times(1)).findById(1L);
    }
    @Test
    void verificaSeExcluiLocatario(){
        when(locatarioRepository.findById(anyLong())).thenReturn(Optional.of(locatario));
        when(aluguelRepository.findByLocatarioNome(anyString())).thenReturn(Optional.empty());

        locatarioService.deletar(1L);

        verify(locatarioRepository, times(1)).findById(1L);
    }
    @Test
    void verificaSeNaoExcluiLocatario(){
        when(locatarioRepository.findById(anyLong())).thenReturn(Optional.of(locatario));
        when(aluguelRepository.findByLocatarioNome(anyString())).thenThrow(AluguelException.class);

        assertThrows(AluguelException.class, () -> locatarioService.deletar(1L));
    }
}

