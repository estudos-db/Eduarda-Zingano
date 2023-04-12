package org.example;


public class MatrizService {

    private int linha = 3;
    private int coluna = 3;
    private int diagonalPrincipal;
    private int matriz[][] = new int[linha][coluna];

    public int montagemMatriz(int matriz[][]) {
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" \n");
        }
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (i == j) {
                    diagonalPrincipal = diagonalPrincipal + matriz[i][j];
                }
            }
        }
        System.out.println("A soma da diagonal principal é: " + diagonalPrincipal);
        return diagonalPrincipal;
    }
}