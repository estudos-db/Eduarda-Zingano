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

    public boolean guincharAutomovel(String getTipo, String getModelo) {
        boolean guinchar;
        if(getTipo == "guincho" || getTipo == "Guincho") {
             guinchar = false;
            System.out.println("O veículo " + getTipo + " não pode ser guinchado.");
        } else {
            guinchar = true;
            System.out.println("Seu automóvel " + getTipo + " modelo: " + getModelo + " foi guinchado!");
        }

       return guinchar;
    }
}
