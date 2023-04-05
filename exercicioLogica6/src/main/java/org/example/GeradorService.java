package org.example;

import java.util.*;

public class GeradorService {
    private int maior;
    private int menor;
    private int tamanho;
    private int lista[] = new int[10];
    private int tamanhoArr = lista.length;

    public int[] geradorLista() {
        Random aleatorios = new Random();
        for (tamanho = 0; tamanho < tamanhoArr; tamanho++) {
            lista[tamanho] = aleatorios.nextInt(101);
        }
        System.out.println(Arrays.toString(lista));
        return lista;
    }
    public int pegaMenorNumero() {
        menor =  Arrays.stream(lista).min().getAsInt();
        System.out.println("Menor número é: " + menor);
        return menor;
    }

    public int pegaMaiorNumero() {
        maior = Arrays.stream(lista).max().getAsInt();
        System.out.println("Maior número é: " + maior);
        return maior;
    }

}




