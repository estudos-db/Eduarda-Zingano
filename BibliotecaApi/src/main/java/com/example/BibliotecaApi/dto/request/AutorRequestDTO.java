package com.example.BibliotecaApi.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;


import java.time.Year;

@Getter
@Builder
public class AutorRequestDTO {
    @NotBlank(message = "Nome é obrigatório")
    private String nome;
    private String genero;
    @NotNull(message = "Ano de nascimento é obrigatório")
    private Year anoNascimento;
    @NotNull(message = "CPF não pode ser nulo")
    private String cpf;
}
