package org.example;


import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;


    public Pessoa(String nome, int idade, Pessoa pai , Pessoa mae ) {
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

    public List<String> gerarListaFamilia() {
        List<String> membrosFamilia = new ArrayList<>();
        membrosFamilia.add(this.nome);
        if (this.pai != null) {
            membrosFamilia.addAll(this.pai.gerarListaFamilia());
        }
        if (this.mae != null) {
            membrosFamilia.addAll(this.mae.gerarListaFamilia());
        }
        return membrosFamilia;
    }


}

