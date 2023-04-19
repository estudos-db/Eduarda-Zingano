package org.example;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Livro livro = new Livro();
        Emprestimo emprestimo = new Emprestimo(livro, pessoa);


        emprestimo.pegarLivroEmprestado("It a coisa", "Stephen King", "João", 2343);
        emprestimo.pegarLivroEmprestado("Doutor Sono", "Stephen King", "Julia", 5689);

        emprestimo.mostrarEmprestimo();
        System.out.println("");
        emprestimo.devolverLivro(0);
        System.out.println("");
        emprestimo.mostrarEmprestimo();



    }
}
