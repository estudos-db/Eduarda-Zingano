package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Pessoa {

    private static ArrayList<String> livrosEmprestados = new ArrayList<>(Arrays.asList("Jogo Perigoso", "Doutor Sono"));

    public ArrayList<String> getlivrosEmprestados() {
        return livrosEmprestados;
    }
}
