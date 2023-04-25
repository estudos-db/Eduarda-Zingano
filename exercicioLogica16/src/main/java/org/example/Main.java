package org.example;

public class Main {

    public static void main(String[] args) {
        Emprestimo emprestimo = new Emprestimo();


        emprestimo.pegarLivroEmprestado(new Livro("It a coisa", "Stephen King"), new Pessoa("João", 2343));
        emprestimo.pegarLivroEmprestado(new Livro("Doutor Sono", "Stephen King"), new Pessoa("Julia", 5689)) ;

        emprestimo.mostrarEmprestimo();
        System.out.println("");
        emprestimo.devolverLivro(0);
        System.out.println("");
        emprestimo.mostrarEmprestimo();



    }
}
