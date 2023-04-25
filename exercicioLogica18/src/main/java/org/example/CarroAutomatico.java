package org.example;

public class CarroAutomatico extends Carro {

    public CarroAutomatico(String marca, String modelo, int velocidadeMaxima, String tipo) {
        super(marca, modelo, velocidadeMaxima, tipo);

        setRodas(4);
    }

    public boolean condicaoLigarCarro() {


        if (frearCarro() == false){
            System.out.println("O carro não pode ser ligado enquanto o freio não estiver acionado!");
        }else if(frearCarro() == true) {
            System.out.println("O carro ligou!");

        }
        return frearCarro();
    }
}
