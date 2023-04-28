package org.example;

public class Main {

    public static void main(String[] args) {

        Livro livroIt =  new Livro("It a coisa", "Stephen King");
        Livro livroDs = new Livro("Doutor Sono", "Stephen King");

        Pessoa pessoa1 = new Pessoa("João", 2343);
        Pessoa pessoa2 = new Pessoa("Julia", 5689);


        Emprestimo emprestimo =  new Emprestimo(livroDs, pessoa1);
        Emprestimo emprestimo1 = new Emprestimo(livroIt, pessoa2);

        emprestimo.adicionaLivroNaLista();
        emprestimo1.adicionaLivroNaLista();

        System.out.println(emprestimo1.getListaLivros());


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
