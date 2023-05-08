package org.example;


public class Pessoa {

    private String nome;
    private int idade;
    private Pai pai;
    private Mae mae;


    public Pessoa(String nome, int idade, Pai pai , Mae mae ) {
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Pessoa getNomePai() {
        return pai;
    }

    public Pessoa getNomeMae() {
        return mae;
    }


}

