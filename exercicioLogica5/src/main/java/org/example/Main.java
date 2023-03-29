package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TabuadaService multiplicar = new TabuadaService();
        Tabuada tabuada = new Tabuada();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        tabuada.setNumero(teclado.nextInt()) ;
        teclado.close();

        System.out.println("Tabuada do número: " + tabuada.getNumero());
        multiplicar.multiplica(tabuada.getNumero(), tabuada.getMultiplicador(), tabuada.getResultadoFinal());



    }
}