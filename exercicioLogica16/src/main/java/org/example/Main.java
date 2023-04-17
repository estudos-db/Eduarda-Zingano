package org.example;

public class Main {

    public static void main(String[] args) {

        Livro livro = new Livro();

        Pessoa pessoa = new Pessoa();

        Emprestimo emprestimo = new Emprestimo(livro, pessoa);

        MenuUsuario menuUsuario = new MenuUsuario(emprestimo);

        menuUsuario.confereLivrosDisponiveis();


    }
}
