package org.example;


public class VerificaIdade {
    int idade = 25;
    public VerificaIdade() {
       String maiorIdade = "você já é maior de idade";
       String menorIdade = "você ainda é menor de idade";

       if (idade < 18 ) {
            System.out.println(menorIdade);
        } else {
            System.out.println(maiorIdade);
        }
    }
}
