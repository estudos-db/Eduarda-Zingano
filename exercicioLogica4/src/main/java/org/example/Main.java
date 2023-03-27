package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CalculadoraService calcular = new CalculadoraService();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escolha a operação que deseja fazer: +, - , /, *");

        String sinalTexto = teclado.nextLine();
        char sinal = sinalTexto.charAt(0);

        System.out.println("Digite o primeiro valor: ");
        BigDecimal valorUm = BigDecimal.valueOf(teclado.nextDouble());

        System.out.println("Digite o segundo valor: ");
        BigDecimal valorDois = BigDecimal.valueOf(teclado.nextDouble());

        teclado.close();

        calcular.calcula(valorUm,valorDois,sinal);
    }
}
