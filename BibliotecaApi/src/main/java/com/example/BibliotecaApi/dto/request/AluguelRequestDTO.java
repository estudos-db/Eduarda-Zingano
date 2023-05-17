package com.example.BibliotecaApi.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
@Getter
@Builder
public class AluguelRequestDTO {
    @NotNull(message = "Livros não podem ser nulos")
    private List<Long> idLivros;
    @NotNull(message = "Locatario não pode ser nulo")
    private Long idLocatario;
}
