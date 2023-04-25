package org.example;


import java.util.ArrayList;

public class Agenda {

    private Contato contato;
    private ArrayList<String> contatosNomes = new ArrayList<>();
    private ArrayList<Integer> contatosNumeros = new ArrayList<>();
    private ArrayList<String> contatoEnderecos = new ArrayList<>();


    public void adicionarContato (Contato contato) {

        contatosNomes.add(contato.getNome());

        contatosNumeros.add(contato.getNumero());

        contatoEnderecos.add(contato.getRua() + ", " + contato.getBairro() + ", " + contato.getCidade() + ", " + contato.getCep());



    }


    public void removerContato(int index) {
        System.out.println("Contato " + contatosNomes.get(index) + " removido com sucesso");

        contatosNomes.remove(index);
        contatosNumeros.remove(index);


    }

    public void mostrarAgenda() {
        System.out.println("Sua lista de contatos: ");
        for (int index = 0; index < contatosNomes.size(); index++ ) {
            System.out.println(((index) + ": " + contatosNomes.get(index) + ": " + contatosNumeros.get(index)) + " Endereço: " + contatoEnderecos.get(index));

        }

    }

    public ArrayList<String> getContatosNomes() {
        return contatosNomes;
    }

    public ArrayList<Integer> getContatosNumeros() {
        return contatosNumeros;
    }

    public ArrayList<String> getContatoEnderecos() {
        return contatoEnderecos;
    }
}
