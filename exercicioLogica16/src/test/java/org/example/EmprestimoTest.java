package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;



public class EmprestimoTest {



    Emprestimo emprestimo;


    @Test
    public void verificaSePegaLivro(){

        Assert.assertTrue(emprestimo.pegarLivroEmprestado(1));

    }
    @Test
    public void verificaSeDevolveLivro(){

        Assert.assertTrue(emprestimo.devolverLivro(1));

    }
}