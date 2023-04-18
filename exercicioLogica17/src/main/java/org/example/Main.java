package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Pessoa> membros = new ArrayList<>();
    public static void main(String[] args) {


        membros.add(new Pessoa("Eduarda", 21, "Valmor", "Patricia"));
        membros.add(new Pessoa("Patricia", 42, "Jose", "Maribel"));
        membros.add(new Pessoa("Valmor", 47, "Olvirio", "Isolina"));

        System.out.println("======Árvore Genealógica======");

        for (Pessoa arvore: membros)   {
            System.out.println("Nome do(a) filho(a) é " + arvore.getNome() + " e sua idade é : " + arvore.getIdade());
            System.out.println("Sua mãe se chama: " + arvore.getNomeMae());
            System.out.println("Seu pai se chama: " + arvore.getNomePai());

        }
    }
}