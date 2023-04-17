package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class VetorServiceTest {

    VetorService vetorService = new VetorService();

    @Test
    void verificaSeForamGeradosNumerosVetor() {

        boolean numerosGerados = false;

        int[] vetorTeste = vetorService.juntaVetores();

        for(int x = 0; x < vetorTeste.length; x++){
            if (vetorTeste[x] >= 0){
                numerosGerados = true;
            }
        }

        Assert.assertTrue(numerosGerados);
    }

    @Test
    void verificaOrdemNumerosVetor() {
        vetorService.criaVetorUm();
        vetorService.criaVetorDois();
        vetorService.juntaVetores();

        boolean menorNumero = false;
        boolean maiorNumero = false;
        boolean ordenado = false;

        int[] vetorOrdenado = vetorService.ordenaVetores();

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

    public boolean verificaSeArrayExisteEmOutroArray(int[] arr1, int[] arr2) {
        for (Object e : arr1) {
            if (!Arrays.asList(arr2).contains(e)) {
                return false;


            }
        }
        return true;
    }

    @Test
    void verificaSeVetorUmExisteNoVetorTres() {
        int [] vetorUm = vetorService.criaVetorUm();
        int [] vetorTres = vetorService.juntaVetores();

        boolean contemArray = false;

        for (int i = 0; i < vetorTres.length; i++){
            for(int j = 0; j < vetorUm.length; j++){
                if (Arrays.asList(vetorTres[i]).containsAll(Arrays.asList(vetorUm[j]))){
                    contemArray = true;

                    System.out.println(Arrays.asList(vetorTres[i]).containsAll(Arrays.asList(vetorUm[j])));
                }



            }
        }

        Assert.assertTrue(contemArray);

    }

    @Test
    void verificaSeVetorDoisExisteNoVetorTres() {
        int [] vetorDois = vetorService.criaVetorDois();
        int [] vetorTres = vetorService.juntaVetores();

        boolean contemArray = false;

        for (int i = 0; i < vetorTres.length; i++){
            for(int j = 0; j < vetorDois.length; j++){
                if (Arrays.asList(vetorTres[i]).containsAll(Arrays.asList(vetorDois[j]))){
                    contemArray = true;

                    System.out.println(Arrays.asList(vetorTres[i]).containsAll(Arrays.asList(vetorDois[j])));
                }



            }
        }




        Assert.assertTrue(contemArray);
    }

}