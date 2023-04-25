package org.example;


import java.util.ArrayList;

public class Emprestimo {
    private Livro livro;

    private Pessoa pessoa;

    private ArrayList<String> membros = new ArrayList<>();
    private ArrayList<Integer> docBiblioteca = new ArrayList<>();

    private ArrayList<String> listaLivros = new ArrayList<>();



    public void pegarLivroEmprestado(Livro livro, Pessoa pessoa){
        membros.add(pessoa.getNome());
        docBiblioteca.add(pessoa.getDocBiblioteca());

        listaLivros.add(livro.getTitulo() + " de " + livro.getAutor());

    }

    public void devolverLivro(int index) {
        System.out.println("Livro " + listaLivros.get(index) + " que foi emprestado para "+ membros.get(index) + " foi devolvido com sucesso");

        membros.remove(index);
        docBiblioteca.remove(index);

        listaLivros.remove(index);


    }

    public void mostrarEmprestimo() {
        System.out.println("Lista de livros emprestados: ");
        for (int index = 0; index < membros.size(); index++ ) {
            System.out.println(((index) + ": Membro biblioteca: " +membros.get(index) + ", documento da biblioteca: " + docBiblioteca.get(index)) + " Livro escolhido: " + listaLivros.get(index));

        }

    }

    public ArrayList<String> getMembros() {
        return membros;
    }

    public void setMembros(ArrayList<String> membros) {
        this.membros = membros;
    }

    public ArrayList<Integer> getDocBiblioteca() {
        return docBiblioteca;
    }

    public void setDocBiblioteca(ArrayList<Integer> docBiblioteca) {
        this.docBiblioteca = docBiblioteca;
    }

    public ArrayList<String> getListaLivros() {
        return listaLivros;
    }

    public void setListaLivros(ArrayList<String> listaLivros) {
        this.listaLivros = listaLivros;
    }
}


