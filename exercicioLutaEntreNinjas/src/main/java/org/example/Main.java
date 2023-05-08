package org.example;

public class Main {
    public static void main(String[] args) {

        NinjaDeNinjutsu neji = new NinjaDeNinjutsu("Neji");
        NinjaDeNinjutsu gaara = new NinjaDeNinjutsu("Gaara");


        Jutsu jutsuNeji = new Jutsu("Oito Trigramas Sessenta e Quatro Palmas",35, 10);
        neji.adicionarJutsu("Oito Trigramas Sessenta e Quatro Palmas", jutsuNeji);

        Jutsu jutsuGaara = new Jutsu("Chuva de Areia",50, 10);
        gaara.adicionarJutsu("Chuva de Areia", jutsuGaara);


        neji.usarJutsu(neji, jutsuNeji, gaara);
        gaara.desviar(gaara, jutsuNeji, neji);
        System.out.println("A vida atual do personagem " + gaara.getNome() + " é: " + gaara.getVida());

    }
}