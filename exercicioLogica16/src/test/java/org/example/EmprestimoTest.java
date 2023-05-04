package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


public class EmprestimoTest {
    private Livro livroCm = new Livro("Cemitério Maldito", "Stephen King");

    private  Pessoa pessoa = new Pessoa("Lucas", 3567);

    private Emprestimo emprestimo = new Emprestimo(new ArrayList<>(Arrays.asList(livroCm)), pessoa);



    @Test
    public void verificaSePegaLivro() {
        emprestimo.adicionaLivroNaLista(livroCm);
        Assert.assertEquals(1, emprestimo.getListaLivros().size());
    }

    @Test
    public void verificaSeTemAlgoNaLista() {
        emprestimo.adicionaLivroNaLista(livroCm);

        Assert.assertTrue(emprestimo.getListaLivros().stream().anyMatch(livro -> livro.getTitulo().contains("Cemitério Maldito")));
    }


    @Test
    public void verificaSeDevolveLivro() {
        emprestimo.adicionaLivroNaLista(livroCm);
        emprestimo.devolverLivro(0);

        Assert.assertEquals(0, emprestimo.getListaLivros().size());



    }
}