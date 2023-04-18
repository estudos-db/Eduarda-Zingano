package org.example;

public class MotoPartidaPedal extends Moto {
    public MotoPartidaPedal(String marca, String modelo, int velocidadeMaxima, String tipo) {
        super(marca, modelo, velocidadeMaxima, tipo);

        setRodas(2);
    }

    public boolean condicaoLigarMoto (boolean acelerar) {

        if(acelerar == false) {
            setLigarAutomovel(false);
            System.out.println("O acelerador precisa estar puxado para ligar a moto!");
        } else if(acelerar == true) {
            ligarMoto();
            System.out.println("A moto está ligada!");
        }
        return acelerar;
    }

}
