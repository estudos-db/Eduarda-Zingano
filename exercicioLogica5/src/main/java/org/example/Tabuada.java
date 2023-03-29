package org.example;

public class Tabuada {
    private int numero;
    private int multiplicador;
    private int resultadoFinal;

    public void Tabuada(int numero, int multiplicador, int resultadoFinal) {
        this.numero = numero;
        this.multiplicador = multiplicador;
        this.resultadoFinal = resultadoFinal;
    }

    public int getNumero() {
        return numero;
    }

    public int setNumero(int numero) {
        this.numero = numero;
        return numero;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

    public int setMultiplicador() {
        this.multiplicador = multiplicador;
        return multiplicador;
    }

    public int getResultadoFinal() {
        return resultadoFinal;
    }

    public void setResultadoFinal() {
        this.resultadoFinal = resultadoFinal;
    }
}
