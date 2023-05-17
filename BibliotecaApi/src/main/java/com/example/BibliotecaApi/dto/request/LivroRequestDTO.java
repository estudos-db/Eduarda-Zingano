package com.example.BibliotecaApi.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Builder
public class LivroRequestDTO {
    @NotBlank(message = "Nome não pode ser vazio")
    private String nome;
    @NotNull(message = "ISBN invalido")
    private String isbn;
    @NotNull(message = "Data de Publicação não pode ser nula")
    private LocalDate dataPublicacao;
    @NotNull(message = "Autores não podem ser nulos")
    private List<Long> autoresId;
}
