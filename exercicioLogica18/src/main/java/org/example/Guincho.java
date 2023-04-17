package org.example;

public class Guincho extends Automovel {

    public Guincho(String marca, String modelo, int velocidadeMaxima, String tipo) {
        super(marca, modelo, velocidadeMaxima, tipo);

        setRodas(4);
    }

    public boolean ligarGuincho () {
        return setLigarAutomovel(true);
    }

    public boolean frearGuincho () {
        return setFrear(true);
    }

    public boolean acelerarGuincho() {
        return setAcelerar(true);
    }

    public void guincharAutomovel(String getTipo, String getModelo) {
        System.out.println("Seu automóvel " + getTipo + " modelo:" + getModelo + " foi guinchado(a)!");

    }
}
