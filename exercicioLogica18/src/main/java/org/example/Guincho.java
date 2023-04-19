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

    public boolean guincharAutomovel(Automovel automovel) {
        boolean guinchar = false;
        if(automovel instanceof Guincho) {
            System.out.println("O veículo " + getTipo() + " não pode ser guinchado.");
        } else {
            guinchar = true;
            System.out.println("Seu automóvel " + automovel.getTipo() + " do modelo " + automovel.getModelo() + " foi guinchado!");
        }

       return guinchar;
    }
}
