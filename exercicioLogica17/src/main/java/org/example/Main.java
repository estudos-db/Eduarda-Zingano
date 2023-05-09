package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Pessoa> membrosFamilia = new ArrayList<>();
    public static void main(String[] args) {
        Pessoa avo = new Pessoa("Maria", 65, null, null);
        Pessoa mae = new Pessoa("Patricia", 43, null, avo);

        Pessoa pai = new Pessoa("Valmor", 48, null, null);

        Pessoa filho = new Pessoa("Eduarda", 21, pai, mae);

        membrosFamilia.add(filho);

        System.out.println("======Árvore Genealógica======");

        System.out.println(filho.gerarListaFamilia());
    }
}