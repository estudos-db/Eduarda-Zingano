package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;



public class EmprestimoTest {

    private Livro livro = new Livro();

    private Pessoa pessoa = new Pessoa();
    private Emprestimo emprestimo = new Emprestimo(livro, pessoa);


    @Test
    public void verificaSePegaLivro() {
        emprestimo.pegarLivroEmprestado("O Iluminado", "Stephen King", "Lucas", 3567);
        emprestimo.pegarLivroEmprestado("Cemitério Maldito", "Stephen King", "Neusa", 3345);

        Assert.assertEquals(2, pessoa.getPessoa().size());
    }

    @Test
    public void verificaSeTemAlgoNaLista() {
        emprestimo.pegarLivroEmprestado("Carrie", "Stephen King", "Vick", 2435);

        Assert.assertEquals("Vick", pessoa.getPessoa().get(0));
    }


    @Test
    public void verificaSeDevolveLivro() {
        emprestimo.pegarLivroEmprestado("Cujo", "Stephen King", "Juliano", 4389);
        emprestimo.pegarLivroEmprestado("Jogo Perigoso", "Stephen King", "Vanessa", 4809);
        emprestimo.pegarLivroEmprestado("Saco de ossos", "Stephen King", "Rose", 5608);


        emprestimo.devolverLivro(1);
        Assert.assertEquals(2, pessoa.getPessoa().size());
    }
}