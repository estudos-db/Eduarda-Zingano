package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;

public class MainTest {

    double preco = 295.50;

    @Test
    public void verificaSeDescontaDezPorCento() {
        double desconto = (preco*0.10);
        double valorFinal = preco - desconto;

        double expect = 265.95;
        double actual = valorFinal;

        Assertions.assertEquals(expect, actual);
    }
    @Test
    public void verificaSeDescontaVintePorCento() {
        double desconto = (preco*0.20);
        double valorFinal = preco - desconto;

        double expect = 236.40;
        double actual = valorFinal;

        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void verificaSeDescontaVinteECincoPorCento() {
        double desconto = (preco*0.25);
        double valorFinal = preco - desconto;

        double expect = 221.625;
        double actual = valorFinal;

        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void deveRetornarComSucesso() {
        Produto actual = new Produto("Televisão", new BigDecimal("295.50"), 21);


        ProdutoService produtoService = new ProdutoService();
        BigDecimal resultado = produtoService.calculaDesconto(actual.getQuantidade(), actual.getDescricao(), actual.getPreco());


        Assertions.assertEquals(new BigDecimal("236.4000"), resultado);
    }
}