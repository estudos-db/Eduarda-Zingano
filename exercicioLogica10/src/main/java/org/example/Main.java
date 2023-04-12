package org.example;

public class Main {
    public static void main(String[] args) {

        MatrizService matrizService= new MatrizService();

        matrizService.montagemMatriz(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8 ,9}
        });


    }
}