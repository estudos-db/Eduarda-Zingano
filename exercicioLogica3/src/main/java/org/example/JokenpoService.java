package org.example;

import java.util.Map;
import java.util.Random;

public class JokenpoService {

    public Map<String, Integer> jogadas( int jogadaJogador, int jogadaMaquina) {

        var random =  new Random();
        switch (jogadaJogador) {
            case 1 -> System.out.println("O Jogador escolheu Pedra");
            case 2 -> System.out.println("O Jogador escolheu Papel");
            case 3 -> System.out.println("O Jogador escolheu Tesoura");
        }


        jogadaMaquina = (int) (Math.random() * 3 + 1);
            if(jogadaMaquina == 1) {
                System.out.println("A Máquina escolheu Pedra");
            } else if (jogadaMaquina == 2) {
                System.out.println("A Máquina escolheu Papel");
            } else if (jogadaMaquina == 3) {
                System.out.println("A Máquina escolheu Tesoura");
            }

        if(jogadaJogador == jogadaMaquina) {
            System.out.println("Empate");
        } else if (jogadaJogador == 1 && jogadaMaquina == 3) {
            System.out.println("Jogador venceu!");
        } else if (jogadaJogador == 2 && jogadaMaquina == 1) {
            System.out.println("Jogador venceu!");
        } else if (jogadaJogador == 3 && jogadaMaquina == 2) {
            System.out.println("Jogador venceu!");
        } else {
            System.out.println("Máquina venceu!");
        } return Map.of("jogador", jogadaJogador,"maquina", jogadaMaquina);
    }
}
