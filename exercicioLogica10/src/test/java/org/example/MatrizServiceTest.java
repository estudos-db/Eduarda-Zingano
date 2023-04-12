package org.example;

import org.junit.Assert;
import org.junit.Test;

public class MatrizServiceTest {
    MatrizService matrizService = new MatrizService();

    @Test
    public void deveCalcularDiagonalPrincipal() {
        int matriz [][] = new int[][] {
                {9, 2, 3},
                {4, 5, 6},
                {7, 8, 2}
        };

        Assert.assertEquals(16, matrizService.montagemMatriz(matriz));
    }

}