package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        Menu menu = new Menu();
        Pedido pedido = new Pedido();

        do{
            menu.controlaMenu();
            System.out.println("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            menu.switchCase(opcao, pedido, scanner);
        }
        while(opcao != 0);

        scanner.close();
    }


}