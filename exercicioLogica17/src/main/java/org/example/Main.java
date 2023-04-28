package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Pessoa> membrosFamilia = new ArrayList<>();
    public static void main(String[] args) {
        Mae mae = new Mae("Patricia", 43, null, null);
        new Pai("Pai da patricia", 67, null, null);
        new Mae("Mae Patricia", 65, null, null);

        Pai pai = new Pai("Valmor", 48, null, null);
        new Pai("Pai do Valmor", 80, null, null);
        new Mae("Mae do Valmor", 75, null, null);

        Pessoa filho = new Pessoa("Eduarda", 21, pai, mae);

        membrosFamilia.add(filho);

        System.out.println("======Árvore Genealógica======");

        for (Pessoa arvore: membrosFamilia)   {
            System.out.println("Nome do(a) filho(a) é " + arvore.getNome() + " e sua idade é : " + arvore.getIdade());
            System.out.println("Sua mãe se chama: " + mae.getNome());
            System.out.println("Seu pai se chama: " + pai.getNome());

        }
    }
}