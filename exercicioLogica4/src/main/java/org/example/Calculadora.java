package org.example;

import java.math.BigDecimal;


public class Calculadora {
    private BigDecimal valorUm;
    private BigDecimal valorDois;

    private char sinal;

    public Calculadora(BigDecimal valorUm, BigDecimal valorDois, char sinal) {
        this.valorUm = valorUm;
        this.valorDois = valorDois;
        this.sinal = sinal;
    }


    public BigDecimal getValorUm() {
        return valorUm;
    }

    public void setValorUm(BigDecimal valorUm) {
        this.valorUm = valorUm;
    }

    public BigDecimal getValorDois() {
        return valorDois;
    }

    public void setValorDois(BigDecimal valorDois) {
        this.valorDois = valorDois;
    }

}
