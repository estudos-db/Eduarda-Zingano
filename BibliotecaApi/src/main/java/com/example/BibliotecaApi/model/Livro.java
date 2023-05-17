package com.example.BibliotecaApi.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Livro  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Nome não pode ser vazio")
    private String nome;
    @NotNull(message = "ISBN invalido")
    private String isbn;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataPublicacao;
    private boolean alugado = false;
    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Autor> autores;
}

