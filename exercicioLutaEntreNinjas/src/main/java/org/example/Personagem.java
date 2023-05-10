package org.example;

import java.util.HashMap;
import java.util.Map;

public class Personagem{
    Jutsu jutsu;
    private String nome;
    private Map<String, Jutsu> jutsus;
    private int chakra = 100;
    private int vida = 100;

    public Personagem(String nome) {
        this.nome = nome;
        this.jutsus = new HashMap<>();
    }

    public void adicionarJutsu(String novoJutsu, Jutsu jutsu) {
        jutsus.put(novoJutsu,jutsu);

    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Map<String, Jutsu> getJutsus() {
        return jutsus;
    }

    public void setJutsus(Map<String, Jutsu> jutsus) {
        this.jutsus = jutsus;
    }


    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getChakra() {
        return chakra;
    }

    public void setChakra(int chakra) {
        this.chakra = chakra;
    }
}

