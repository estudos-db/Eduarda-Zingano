package org.example;


import java.util.ArrayList;


public class Agenda {
    private Contato contatoPrincipal;
    private ArrayList<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();

    }

    public void adicionarContato(Contato contato) {
        this.contatoPrincipal = contato;
        contatos.add(contato);
    }



    public void removerContato(int index) {
        System.out.println("Contato " + contatoPrincipal.getNome()  + " removido com sucesso");
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
