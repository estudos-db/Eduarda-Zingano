package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        JokenpoService jokenpo = new JokenpoService();

      var iniciaJogo =  jokenpo.jogadas(2, 0);

      var jogador = iniciaJogo.get("jogador");
      var maquina = iniciaJogo.get("maquina");
    }
}
