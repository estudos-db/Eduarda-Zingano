package org.example;

import java.util.Arrays;
import java.util.Random;

public class VetorService {
    private int[] vetorUm = new int[50];
    private int[] vetorDois = new int[50];
    private int[] vetorTres = new int[vetorUm.length + vetorDois.length];
    private int auxiliar = 0;
    private int i = 0;
    private Random aleatorios = new Random();
    public int [] criaVetorUm() {

        System.out.println("Vetores aleatórios: ");
        for(i = 0; i < vetorUm.length; i++){
            vetorUm[i] = aleatorios.nextInt(500);

        }

        System.out.println(Arrays.toString(vetorUm));


        return vetorUm;
    }

    public int[] criaVetorDois() {
        for(i = 0; i < vetorDois.length; i++){
            vetorDois[i] = aleatorios.nextInt(500);

        }
        System.out.println(Arrays.toString(vetorDois));
        return vetorDois;
    }

    public int [] juntaVetores() {
        int posicoes = 0;

        for (int element: vetorUm) {
            vetorTres[posicoes] = element;
            posicoes++;
        }
        for (int element: vetorDois) {
            vetorTres[posicoes] = element;
            posicoes++;
        } return vetorTres;
    }
    public int [] ordenaVetores() {

        for(i = 0; i < 50; i++){
            for(int j = 0; j < 49; j++){
                if(vetorUm[j] > vetorUm[j + 1]){
                    auxiliar = vetorUm[j];
                    vetorUm[j] = vetorUm[j+1];
                    vetorUm[j+1] = auxiliar;
                }
            }
        }

        for(i = 0; i < 50; i++){
            for(int j = 0; j < 49; j++){
                if(vetorDois[j] > vetorDois[j + 1]){
                    auxiliar = vetorDois[j];
                    vetorDois[j] = vetorDois[j+1];
                    vetorDois[j+1] = auxiliar;
                }
            }
        }

        for(i = 0; i < 100; i++){
            for(int j = 0; j < 99; j++){
                if(vetorTres[j] > vetorTres[j + 1]){
                    auxiliar = vetorTres[j];
                    vetorTres[j] = vetorTres[j+1];
                    vetorTres[j+1] = auxiliar;
                }
            }
        }
        System.out.println("Vetores ordenados: ");
        for(i = 0; i< 50; i++){

        } System.out.println(Arrays.toString(vetorUm));
        System.out.println(Arrays.toString(vetorDois));
        System.out.println("Vetor 1 + Vetor 2 ordenados: ");
        System.out.println(Arrays.toString(vetorTres));


        return vetorTres;
    }

}
