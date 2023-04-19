package org.example;

public class Main {
    public static void main(String[] args) {

        CarroAutomatico carroAutomatico = new CarroAutomatico("Toyota","Corolla",210, "Carro Automático");

        MotoPartidaPedal motoPartidaPedal = new MotoPartidaPedal("Yamaha", "Fazer", 150, "moto");

        Carro carro = new Carro("Fiat", "Uno", 160, "Carro");

        Guincho guincho = new Guincho("Volvo", "FH 540", 170, "Guincho");

        guincho.guincharAutomovel(guincho);
        guincho.guincharAutomovel(carro);

        carroAutomatico.condicaoLigarCarro();
        motoPartidaPedal.condicaoLigarMoto();
    }
}