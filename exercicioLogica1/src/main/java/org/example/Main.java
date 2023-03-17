package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int idade = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua idade");
        idade = teclado.nextInt();

        if(idade < 18 ) {
            System.out.println("você ainda é menor de idade");
        } else {
            System.out.println("você já é maior de idade");
        }
    }
}