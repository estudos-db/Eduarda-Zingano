package org.example;

public class Main {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();


        agenda.adicionarContato(new Contato("Cláudio", 123344565, "Estr. João de Oliveira Remião", "Agronomia", "Porto Alegre", "91550000"));
        agenda.adicionarContato(new Contato("Clóvis", 40028922, "São Joaquim", "Liberdade", "São Paulo", "01508001"));


        agenda.mostrarAgenda();
        System.out.println("");
        agenda.removerContato(1);
        System.out.println("");
        agenda.mostrarAgenda();



    }
}