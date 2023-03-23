package org.example;

public class Tabuada {
    private int numero;

    private int contador;
    private int multiplicador;
    private int resultadoFinal = (multiplicador * contador);

    public void Tabuada() {
        this.numero = numero;
        this.contador = contador;
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

    public int getContador() {
        return contador;
    }

    public int setContador() {
        this.contador = contador;
        return contador;
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
