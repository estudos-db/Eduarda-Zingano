package org.example;


public class Pessoa {

    private String nome;
    private int idade;
    private String nomePai;
    private String nomeMae;


    public Pessoa(String nome, int idade, String nomePai, String nomeMae) {
        this.nome = nome;
        this.idade = idade;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getNomePai() {
        return nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }
}

