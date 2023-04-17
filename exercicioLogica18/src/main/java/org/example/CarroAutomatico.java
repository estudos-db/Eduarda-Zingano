package org.example;

public class CarroAutomatico extends Carro {

    public CarroAutomatico(String marca, String modelo, int velocidadeMaxima, String tipo) {
        super(marca, modelo, velocidadeMaxima, tipo);

        setRodas(4);
    }

    public void condicaoLigarCarro(boolean frear) {

        ligarCarro();


        if (setFrear(false)){
            System.out.println("O carro não pode ser ligado enquanto o freio não estiver acionado!");
            setLigarAutomovel(false);
        }else if(setFrear(true)) {
            System.out.println("O carro ligou!");
            setFrear(false);
        }
    }
}
