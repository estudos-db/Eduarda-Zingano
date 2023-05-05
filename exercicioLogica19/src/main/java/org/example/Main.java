package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Contato contato1 = new Contato("Cláudio", "123344565", "Estr. João de Oliveira Remião", "Agronomia", "Porto Alegre", "91550000");
        Contato contato2 = new Contato("Clóvis", "40028922", "São Joaquim", "Liberdade", "São Paulo", "01508001");

        Agenda agenda1 = new Agenda(new ArrayList<>(Arrays.asList(contato1)));
        Agenda agenda2 = new Agenda(new ArrayList<>(Arrays.asList(contato2)));


        agenda1.adicionarContato(contato1);


        agenda1.mostrarAgenda();
        System.out.println("");
        agenda1.removerContato(0);
        System.out.println("");


        agenda2.adicionarContato(contato2);

        agenda2.mostrarAgenda();
        System.out.println("");
        agenda2.removerContato(0);
        System.out.println("");




    }
}