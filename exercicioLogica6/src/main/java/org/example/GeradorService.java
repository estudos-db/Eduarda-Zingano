package org.example;

import java.util.*;

public class GeradorService {
    private int lista[] = new int[10];
    

    public int[] geradorLista() {
        Random aleatorios = new Random();
        for (int tamanho = 0; tamanho < lista.length; tamanho++) {
            lista[tamanho] = aleatorios.nextInt(101);
        }
        System.out.println(Arrays.toString(lista));
        return lista;
    }
    public int pegaMenorNumero() {
        int menor =  Arrays.stream(lista).min().getAsInt();
        System.out.println("Menor número é: " + menor);
        return menor;
    }

    public int pegaMaiorNumero() {
       int maior = Arrays.stream(lista).max().getAsInt();
        System.out.println("Maior número é: " + maior);
        return maior;
    }

}




