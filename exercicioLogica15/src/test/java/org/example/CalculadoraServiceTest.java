package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;


class CalculadoraServiceTest {

    private BigDecimal valorUm;
    private BigDecimal valorDois;

    private BigDecimal expect;
    @Test
    void verificaAdicao() {

        valorUm = BigDecimal.valueOf(25);

        valorDois = BigDecimal.valueOf(30);

        expect = BigDecimal.valueOf(55);

        Assert.assertEquals(expect, CalculadoraService.calculaAdicao(valorUm, valorDois));

    }

    @Test
    void verificaSubtracao() {

        valorUm = BigDecimal.valueOf(30);

        valorDois = BigDecimal.valueOf(25);

        expect = BigDecimal.valueOf(5);

        Assert.assertEquals(expect, CalculadoraService.calculaSubtracao(valorUm, valorDois));

    }

    @Test
    void verificaMultiplicacao() {

        valorUm = BigDecimal.valueOf(2);

        valorDois = BigDecimal.valueOf(6);

        expect = BigDecimal.valueOf(12);

        Assert.assertEquals(expect, CalculadoraService.calculaMultiplicacao(valorUm, valorDois));

    }

    @Test
    void verificaDivisao() {

        valorUm = BigDecimal.valueOf(30);

        valorDois = BigDecimal.valueOf(2);

        expect = BigDecimal.valueOf(15);

        Assert.assertEquals(expect, CalculadoraService.calculaDivisao(valorUm, valorDois));

    }

    @Test
    void verificaPotenciacao() {

        valorUm = BigDecimal.valueOf(3);

        valorDois = BigDecimal.valueOf(2);

        expect = BigDecimal.valueOf(9);

        Assert.assertEquals(expect, CalculadoraService.calculaPotenciacao(valorUm, valorDois));

    }

}