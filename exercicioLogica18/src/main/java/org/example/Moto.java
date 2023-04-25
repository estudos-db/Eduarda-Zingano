package org.example;

public class Moto extends Automovel {
    public Moto(String marca, String modelo, int velocidadeMaxima, String tipo) {
        super(marca, modelo, velocidadeMaxima, tipo);

        setRodas(2);
    }

    public boolean ligarMoto () {
        return setLigarAutomovel(true);
    }

    public boolean frearMoto () {
        return setFrear(true);
    }

    public boolean acelerarMoto() {
        return setAcelerar(true);
    }

}

