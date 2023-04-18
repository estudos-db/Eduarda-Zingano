package org.example;

public class CarroAutomatico extends Carro {

    public CarroAutomatico(String marca, String modelo, int velocidadeMaxima, String tipo) {
        super(marca, modelo, velocidadeMaxima, tipo);

        setRodas(4);
    }

    public boolean condicaoLigarCarro(boolean frear) {


        if (frear == false){
            System.out.println("O carro não pode ser ligado enquanto o freio não estiver acionado!");
            setLigarAutomovel(false);
        }else if(frear == true) {
            ligarCarro();
            System.out.println("O carro ligou!");
            setFrear(false);
        }
        return frear;
    }
}
