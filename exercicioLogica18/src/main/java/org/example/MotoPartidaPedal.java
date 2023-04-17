package org.example;

public class MotoPartidaPedal extends Moto {
    public MotoPartidaPedal(String marca, String modelo, int velocidadeMaxima, String tipo) {
        super(marca, modelo, velocidadeMaxima, tipo);

        setRodas(2);
    }

    public void condicaoLigarMoto (boolean acelerar) {

        setLigarAutomovel(true);

        if(setAcelerar(false)) {
            setLigarAutomovel(false);
            System.out.println("O acelerador precisa estar puxado para ligar a moto!");
        } else if(setAcelerar(true)) {
            System.out.println("A moto está ligada!");
        }
    }

}
