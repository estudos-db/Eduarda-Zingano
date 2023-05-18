package com.example.BibliotecaApi.Controller;

import com.example.BibliotecaApi.controller.AutorController;
import com.example.BibliotecaApi.dto.request.AutorRequestDTO;
import com.example.BibliotecaApi.model.Autor;
import com.example.BibliotecaApi.service.impl.AutorServiceImpl;
import com.example.BibliotecaApi.util.GsonForYear;
import com.example.BibliotecaApi.util.YearAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.time.Year;

import static com.example.BibliotecaApi.provider.AutorProvider.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AutorController.class)
class AutorControllerTest {

    @MockBean
    private AutorServiceImpl autorService;

    @Autowired
    private MockMvc mockMvc;

    private static final String URI_AUTOR = "/autor";


    @Test
    @DisplayName("Deve retornar status code 201 ao criar um autor com sucesso")
    void deveRetornarSucessoAoCriarAutor () throws Exception{
        when(autorService.salvar(AUTOR_REQUEST_DTO)).thenReturn(AUTOR_A);

        AutorRequestDTO autorEsperado = AUTOR_REQUEST_DTO;
        String autorSendoSalvoJson =  GsonForYear.getGson().toJson(AUTOR_REQUEST_DTO);

        mockMvc.perform(post(URI_AUTOR)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(autorSendoSalvoJson))
                .andExpect(status().isCreated());

        verify(autorService).salvar(autorEsperado);
    }

    @Test
    @DisplayName("Deve retornar a lista de autores com sucesso")
    void deveRetornarListaDeAutoresComSucesso() throws Exception {
        when(autorService.buscarAutorPeloNome("Autor A")).thenReturn(AUTOR_A);

        String autorRetornado = GsonForYear.getGson().toJson(AUTOR_A);

        mockMvc.perform(get(URI_AUTOR)
                        .param("nome", "Autor A")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(autorRetornado))
                .andExpect(status().isOk());

        verify(autorService).buscarAutorPeloNome("Autor A");
    }
}
