package org.example;

import java.util.ArrayList;


public class Pessoa {

    private ArrayList<String> membros = new ArrayList<>();
    private ArrayList<Integer> docBiblioteca = new ArrayList<>();


    public ArrayList<String> getPessoa() {
        return membros;
    }

    public ArrayList<Integer> getDocBiblioteca() {
        return docBiblioteca;
    }
}
