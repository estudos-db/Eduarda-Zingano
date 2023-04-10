package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


class GeradorServiceTest {
    GeradorService geradorService = new GeradorService();
    private int [] arrayTeste = new int[10];
   

    @Test
    void verificaSeGeramNumerosNoArray() {

        boolean numerosGerados = false;
        int[] numerosArray = geradorService.geradorLista();

        for(int x = 0; x < numerosArray.length; x++){
            if (numerosArray[x] >= 0){
                numerosGerados = true;
            }
        }


        Assert.assertTrue(numerosGerados);



    }

    @Test
    void verificaNumeroMaior() {
      int  maiorValor = Arrays.stream(geradorService.geradorLista()).max().getAsInt();

        Assert.assertEquals(maiorValor, geradorService.pegaMaiorNumero());
    }

    @Test
    void verificaNumeroMenor() {
      int  menorValor = Arrays.stream(geradorService.geradorLista()).min().getAsInt();

        Assert.assertEquals(menorValor, geradorService.pegaMenorNumero());
    }


}
