package org.example;

import java.util.Arrays;

public class Personagem {
    private String nome;
    private int idade;
    private String aldeia;
    private String[] jutsus;
    private int chakra;

    public Personagem(String nome, int idade, String aldeia, int chakra) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.jutsus = new String[0];
        this.chakra = chakra;
    }

    public void adicionarJutsu(String novoJutsu) {
        String[] novoArray = new String[jutsus.length + 1];
        for (int i = 0; i < jutsus.length; i++) {
            novoArray[i] = jutsus[i];
        }
        novoArray[novoArray.length - 1] = novoJutsu;
        jutsus = novoArray;

    }

    public void aumentarChakra(int quantidade) {
        chakra += quantidade;

    }

    public String exibirInformacoes() {
        StringBuilder info = new StringBuilder();
        info.append("Nome: " + nome)
                .append("Idade: " + idade)
                .append("Aldeia: " + aldeia)
                .append("Jutsus: " + Arrays.toString(jutsus))
                .append("Chakra: " + chakra);

        return info.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public String[] getJutsus() {
        return jutsus;
    }

    public void setJutsus(String[] jutsus) {
        this.jutsus = jutsus;
    }

    public int getChakra() {
        return chakra;
    }

    public void setChakra(int chakra) {
        this.chakra = chakra;
    }
}

