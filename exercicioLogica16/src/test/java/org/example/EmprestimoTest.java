package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class EmprestimoTest {
    private Livro livroCm = new Livro("Cemitério Maldito", "Stephen King");

    private  Pessoa pessoa = new Pessoa("Lucas", 3567);

    private Emprestimo emprestimo = new Emprestimo(livroCm, pessoa);



    @Test
    public void verificaSePegaLivro() {
        emprestimo.adicionaLivroNaLista();
        Assert.assertEquals(1, emprestimo.getListaLivros().size());
    }

    @Test
    public void verificaSeTemAlgoNaLista() {
        emprestimo.adicionaLivroNaLista();

        Assert.assertTrue(emprestimo.getListaLivros().stream().anyMatch(livro -> livro.getTitulo().contains("Cemitério Maldito")));
    }


    @Test
    public void verificaSeDevolveLivro() {
        emprestimo.adicionaLivroNaLista();
        emprestimo.devolverLivro(0);

        Assert.assertEquals(0, emprestimo.getListaLivros().size());



    }
}