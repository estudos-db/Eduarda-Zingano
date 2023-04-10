package org.example;

import java.util.Arrays;
import java.util.Random;

public class VetorService {
    private int[] vetor = new int[100];
    private int auxiliar = 0;
    private int i = 0;
    public int [] criaVetor() {
        Random aleatorios = new Random();
        System.out.println("Vetor aleatório: ");
        for(i = 0; i < vetor.length; i++){
            vetor[i] = aleatorios.nextInt(500);

        }
        System.out.println(Arrays.toString(vetor));
        return vetor;
    }
    public int [] ordenaVetor() {

        for(i = 0; i<100; i++){
            for(int j = 0; j<99; j++){
                if(vetor[j] > vetor[j + 1]){
                    auxiliar = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = auxiliar;
                }
            }
        }
        System.out.println("Vetor organizado: ");
        for(i = 0; i<100; i++){

        } System.out.println(Arrays.toString(vetor));

        return vetor;
    }
}
