package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanear = new Scanner(System.in);

        String nome;
        double preco;
        int quantidade;
        double desconto;
        double valorFinal;

        System.out.println("Digite o nome de seus produtos");
        nome = scanear.nextLine();

        System.out.println("Digite o preço total de seus produtos");
        preco = scanear.nextDouble();

        System.out.println("Digite a quantidade de seus produtos");
        quantidade = scanear.nextInt();

        if(quantidade > 0 && quantidade <= 10) {
            System.out.println(nome + " no total de " + preco);
        } else if (quantidade <= 20) {
            desconto = (preco * 0.10);
            valorFinal = (preco - desconto);
            System.out.println(nome + " no total de " + preco + " com desconto de " + desconto + " com valor final de " + valorFinal);
        } else if (quantidade <=50) {
            desconto = (preco * 0.20);
            valorFinal = (preco - desconto);
            System.out.println(nome + " no total de " + preco + " com desconto de " + desconto + " com valor final de " + valorFinal);
        } else {
            desconto = (preco * 0.25);
            valorFinal = (preco - desconto);
            System.out.println(nome + " no total de " + preco + " com desconto de " + desconto + " com valor final de " + valorFinal);
        }

    }
}