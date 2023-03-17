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
    }
}