package org.example;

public class JokenpoService {
    int maquina;

    public int jogadas(int jogador) {
        switch (jogador) {
            case 1 -> System.out.println("O Jogador escolheu Pedra");
            case 2 -> System.out.println("O Jogador escolheu Papel");
            case 3 -> System.out.println("O Jogador escolheu Tesoura");
            default -> System.out.println("Opção não faz parte das alternativas dadas");
        }
        maquina = (int) (Math.random() * 3 + 1);
        switch (maquina) {
            case 1 -> System.out.println("A Máquina escolheu Pedra");
            case 2 -> System.out.println("A Máquina escolheu Papel");
            case 3 -> System.out.println("A Máquina escolheu Tesoura");
        }
        if(jogador == maquina) {
            System.out.println("Empate");
        } else if (jogador == 1 && maquina == 3) {
            System.out.println("Jogador venceu!");
        } else if (jogador == 2 && maquina == 1) {
            System.out.println("Jogador venceu!");
        } else if (jogador == 3 && maquina == 2) {
            System.out.println("Jogador venceu!");
        } else {
            System.out.println("Máquina venceu!");
        } return maquina;
    }
}
