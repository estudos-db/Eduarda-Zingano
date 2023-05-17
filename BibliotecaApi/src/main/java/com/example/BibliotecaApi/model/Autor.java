package com.example.BibliotecaApi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Year;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Nome é obrigatório")
    private String nome;
    private String genero;
    @NotNull(message = "Ano de nascimento é obrigatório")
    private Year anoNascimento;
    @NotNull(message = "CPF não pode ser nulo")
    @Column(unique = true)
    private String cpf;

}
