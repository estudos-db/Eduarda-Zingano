package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Livro {

  private static ArrayList <String> arrayLivrosNomes = new ArrayList<>(Arrays.asList("It - A Coisa", "Quatro estações", "Cemitério Maldito", "O Iluminado", "Cujo"));

  public ArrayList<String> getarrayLivrosNomes() {
    return arrayLivrosNomes;
  }
}
