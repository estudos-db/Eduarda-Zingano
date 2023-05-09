package org.example;

public class Carro extends Automovel {

    public Carro(String marca, String modelo, int velocidadeMaxima, String tipo) {
        super(marca, modelo, velocidadeMaxima, tipo);

        setRodas(4);
    }

    public boolean ligarCarro () {
        return setLigarAutomovel(true);
    }

    public boolean frearCarro () {
        return setFrear(false);
    }

    public boolean acelerarCarro() {
        return setAcelerar(true);
    }

}