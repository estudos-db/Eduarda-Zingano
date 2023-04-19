package org.example;

public class Main {
    public static void main(String[] args) {
        Contato contato = new Contato();
        Endereco endereco = new Endereco();
        Agenda agenda = new Agenda(contato, endereco);


        agenda.adicionarContato("Cláudio", 123344565, "Estr. João de Oliveira Remião", "Agronomia", "Porto Alegre", "91550000");
        agenda.adicionarContato("Clóvis", 40028922, "São Joaquim", "Liberdade", "São Paulo", "01508001");


        agenda.mostrarAgenda();
        System.out.println("");
        agenda.removerContato(1);
        System.out.println("");
        agenda.mostrarAgenda();



    }
}