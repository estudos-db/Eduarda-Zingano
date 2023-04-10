package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class VetorServiceTest {

    VetorService vetorService = new VetorService();

    @Test
    void verificaSeForamGeradosNumerosVetor() {

        boolean numerosGerados = false;

        int[] vetorTeste = vetorService.criaVetor();

        for(int x = 0; x < vetorTeste.length; x++){
            if (vetorTeste[x] >= 0){
                numerosGerados = true;
            }
        }

        Assert.assertTrue(numerosGerados);
    }

    @Test
    void verificaOrdemNumerosVetor() {
        vetorService.criaVetor();

        boolean menorNumero = false;
        boolean maiorNumero = false;
        boolean ordenado = false;

        int[] vetorOrdenado = vetorService.ordenaVetor();

        for (int x = 0; x < vetorOrdenado.length; x++){
            if(vetorOrdenado[0] <= vetorOrdenado[x]){
                menorNumero = true;
            }
        }

        for (int x = 0; x < vetorOrdenado.length; x++){
            if(vetorOrdenado[99] >= vetorOrdenado[x]){
                maiorNumero = true;
            }
        }

        if(maiorNumero && menorNumero == true){
            ordenado = true;
        }

        Assert.assertTrue(ordenado);

    }

}