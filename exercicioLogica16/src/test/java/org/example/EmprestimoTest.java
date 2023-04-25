package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;



public class EmprestimoTest {
    private Emprestimo emprestimo = new Emprestimo();


    @Test
    public void verificaSePegaLivro() {
        emprestimo.pegarLivroEmprestado(new Livro("O Iluminado", "Stephen King"), new Pessoa("Lucas", 3567));
        emprestimo.pegarLivroEmprestado(new Livro("Cemitério Maldito", "Stephen King"), new Pessoa("Neusa", 3345));

        Assert.assertEquals(2, emprestimo.getMembros().size());
    }

    @Test
    public void verificaSeTemAlgoNaLista() {
        emprestimo.pegarLivroEmprestado(new Livro("Carrie", "Stephen King"), new Pessoa("Vick", 2435));

        Assert.assertEquals("Vick", emprestimo.getMembros().get(0));
    }


    @Test
    public void verificaSeDevolveLivro() {
        emprestimo.pegarLivroEmprestado(new Livro("Cujo", "Stephen King"), new Pessoa("Juliano", 4389));
        emprestimo.pegarLivroEmprestado(new Livro("Jogo Perigoso", "Stephen King"), new Pessoa("Vanessa", 4809));
        emprestimo.pegarLivroEmprestado(new Livro("Saco de ossos", "Stephen King"), new Pessoa("Rose", 5608));


        emprestimo.devolverLivro(1);
        Assert.assertEquals(2, emprestimo.getMembros().size());
    }
}