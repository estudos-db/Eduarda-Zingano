package org.example;

public class Jokenpo {
    private int jogador;
    private int maquina;
    public Jokenpo(int jogador, int maquina) {
        this.jogador = jogador;
        this.maquina = maquina;
    }

    public int getJogador() {
        return jogador;
    }

    public void setJogador(int jogador) {
        this.jogador = jogador;
    }

    public int getMaquina() {
        return maquina;
    }

    public void setMaquina(int maquina) {
        this.maquina = maquina;
    }
}
