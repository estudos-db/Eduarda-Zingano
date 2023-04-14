package org.example;

import java.util.Arrays;

public class Pessoa {

    protected String nome;
    protected String idade;
    protected String nomePai;
    protected String nomeMae;
    protected String nomeFilho;

    private static Filho filho = new Filho();

    private static Pai pai = new Pai();

    private static Mae mae = new Mae();


    public static void arvoreGenealogica() {

        System.out.println("Pai: " + Arrays.toString(mae.mae()));

        System.out.println("Mãe: " + Arrays.toString(pai.pai()));

        System.out.println("Filho: " + Arrays.toString(filho.filho()));



    }


}
