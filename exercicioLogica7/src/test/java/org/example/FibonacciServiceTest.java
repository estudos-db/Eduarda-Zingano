package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class FibonacciServiceTest {
    FibonacciService fibonacciService = new FibonacciService();
    private int [] arraySequenciaTest = new int[]{};

    @Test

   public void testaNumerosDoArrayDeTamanhoNove() {
        arraySequenciaTest = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        
        Assert.assertEquals(Arrays.toString(arraySequenciaTest),Arrays.toString(fibonacciService.calculaSequenciaFibo(9)));

    }
    @Test
    public void testaNumerosDoArrayDeTamanhoDez() {
        arraySequenciaTest = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};

        Assert.assertEquals(Arrays.toString(arraySequenciaTest),Arrays.toString(fibonacciService.calculaSequenciaFibo(10)));

    }

}
