package org.example;


import org.junit.Assert;
import org.junit.Test;

public class PessoaTest {
    private Pessoa pessoa = new Pessoa("Carlos", 15, "Robson", "Joana");

    @Test
    public void verificaSePuxaFilho() {

        Assert.assertEquals("Carlos", pessoa.getNome());
    }

    @Test
    public void verificaSePuxaIdade() {

        Assert.assertEquals(15, pessoa.getIdade());
    }

    @Test
    public void verificaSePuxaPai() {

        Assert.assertEquals("Robson", pessoa.getNomePai());
    }

    @Test
    public void verificaSePuxaMae() {

        Assert.assertEquals("Joana", pessoa.getNomeMae());
    }
}