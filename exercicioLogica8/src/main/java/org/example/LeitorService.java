package org.example;

import java.util.Scanner;

public class LeitorService {

    public int confereNumeroDigitado() {
        System.out.println("Digite um número inteiro.");

        Scanner scan = new Scanner(System.in);

        int x = 0;
        System.out.println(x);

        while (x != 10) {
            System.out.println("Digite outro número inteiro.");

             x = scan.nextInt();


        }
        System.out.println("Você digitou o número correto!");
        return x;
    }
}
