package org.example;

import java.util.ArrayList;


public class Pessoa {

    private String nome;
    private Integer docBiblioteca;

    public Pessoa(String nome, Integer docBiblioteca) {
        this.nome = nome;
        this.docBiblioteca = docBiblioteca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDocBiblioteca() {
        return docBiblioteca;
    }

    public void setDocBiblioteca(Integer docBiblioteca) {
        this.docBiblioteca = docBiblioteca;
    }
}
