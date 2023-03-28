package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        JokenpoService jokenpo = new JokenpoService();
        int maquina = 0;
        Scanner digitado = new Scanner(System.in);
        System.out.println("Vamos jogar Jokenpo?");
        System.out.println("Escolha: 1- Pedra  2- Papel  3- Tesoura");
        int jogador = digitado.nextInt();
        System.out.println("");

        digitado.close();



        jokenpo.jogadas(jogador);

    }
}
