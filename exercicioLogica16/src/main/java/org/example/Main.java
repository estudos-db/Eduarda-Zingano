package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        Livro livroIt =  new Livro("It a coisa", "Stephen King");
        Livro livroDs = new Livro("Doutor Sono", "Stephen King");

        Pessoa pessoa1 = new Pessoa("João", 2343);
        Pessoa pessoa2 = new Pessoa("Julia", 5689);


        Emprestimo emprestimo =  new Emprestimo(new ArrayList<>(Arrays.asList(livroDs)), pessoa1);
        Emprestimo emprestimo1 = new Emprestimo(new ArrayList<>(Arrays.asList(livroIt)), pessoa2);


        emprestimo.adicionaLivroNaLista(livroDs);
        emprestimo1.adicionaLivroNaLista(livroIt);


        emprestimo.mostrarEmprestimos();
        System.out.println("");
        emprestimo.devolverLivro(0);
        System.out.println("");
        emprestimo.mostrarEmprestimos();

        emprestimo1.mostrarEmprestimos();
        System.out.println("");
        emprestimo1.devolverLivro(0);
        System.out.println("");
        emprestimo1.mostrarEmprestimos();



    }
}
