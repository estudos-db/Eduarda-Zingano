package com.example.BibliotecaApi.dto.request;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
@Getter
@Builder
public class AtualizarLocatarioRequestDTO {
    @NotBlank(message = "Nome não pode ser vazio")
    private String nome;
    private String genero;
    @NotBlank(message = "Número de telefone não pode ser vazio")
    @Size(min = 10, max = 11, message = "Número de telefone deve conter ddd")
    private String telefone;
    @Email(message = "email invalido")
    @Column(unique = true)
    private String email;
    @NotNull(message = "Data de Nascimento não pode ser nula")
    private LocalDate dataNascimento;
}
