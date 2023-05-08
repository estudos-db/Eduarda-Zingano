package org.example;


import org.junit.Assert;
import org.junit.Test;

public class PessoaTest {
    private Mae mae = new Mae("Patricia", 43, null, null);

    private Pai pai = new Pai("Valmor", 48, null, null);

    private Pessoa filho = new Pessoa("Eduarda", 21, pai, mae);

    @Test
    public void verificaSePuxaFilho() {

        Assert.assertEquals("Eduarda", filho.getNome());
    }

    @Test
    public void verificaSePuxaIdade() {

        Assert.assertEquals(21, filho.getIdade());
    }

    @Test
    public void verificaSePuxaPai() {

        Assert.assertEquals("Valmor", pai.getNome());
    }

    @Test
    public void verificaSePuxaMae() {

        Assert.assertEquals("Patricia", mae.getNome());
    }
}