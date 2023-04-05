package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


class GeradorServiceTest {
    GeradorService geradorService = new GeradorService();
    private int [] arrayTeste = new int[10];
    private int menorValor;
    private int maiorValor;

    @Test
    void verificaSeGeraArray() {

        boolean geraArray = false;
        int tamanhoArray = geradorService.geradorLista().length;

        if (tamanhoArray == 10) {
            geraArray = true;
        }

        Assert.assertTrue(geraArray);

    }

    @Test
    void verificaNumeroMaior() {
        maiorValor = Arrays.stream(geradorService.geradorLista()).max().getAsInt();

        Assert.assertEquals(maiorValor, geradorService.pegaMaiorNumero());
    }

    @Test
    void verificaNumeroMenor() {
        menorValor = Arrays.stream(geradorService.geradorLista()).min().getAsInt();

        Assert.assertEquals(menorValor, geradorService.pegaMenorNumero());
    }


}