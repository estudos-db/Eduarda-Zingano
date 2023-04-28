package org.example;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Contato contato1 = new Contato("Cláudio", "123344565", "Estr. João de Oliveira Remião", "Agronomia", "Porto Alegre", "91550000");
        Contato contato2 = new Contato("Clóvis", "40028922", "São Joaquim", "Liberdade", "São Paulo", "01508001");


        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);

        agenda.mostrarAgenda();
        System.out.println("");
        agenda.removerContato(1);
        System.out.println("");
        agenda.mostrarAgenda();



    }
}