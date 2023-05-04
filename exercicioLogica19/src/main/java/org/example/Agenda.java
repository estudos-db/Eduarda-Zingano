package org.example;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> contatos;

    public Agenda(ArrayList<Contato>contatos) {
        this.contatos = new ArrayList<>();

    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }


    public void removerContato(int index) {
        System.out.println("Contato " + contatos.get(index).getNome()  + " removido com sucesso");
        contatos.remove(index);

    }

    public void mostrarAgenda() {
        System.out.println("Sua lista de contatos: ");
        for (int index = 0; index < contatos.size(); index++ ) {
            System.out.println(((index) + ": " + contatos.get(index).getNome() + ", número: " + contatos.get(index).getNumero() + " Endereço: " + contatos.get(index).getRua() + " " + contatos.get(index).getBairro() + " " + contatos.get(index).getCidade() + " " + contatos.get(index).getCep()));

        }

    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }
}
