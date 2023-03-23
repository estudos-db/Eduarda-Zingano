package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


import java.math.BigDecimal;


public class CalculadoraServiceTest {
    BigDecimal valorUm;
    BigDecimal valorDois;
    BigDecimal resultado;

    @Test
    public void verificaSeMultiplica() {
        valorUm = BigDecimal.valueOf(5);
        valorDois = BigDecimal.valueOf(15);
        resultado = valorUm.multiply(valorDois);

        Assertions.assertEquals(resultado, BigDecimal.valueOf(75));
    }

    @Test
    public void verificaSeSoma() {
        valorUm = BigDecimal.valueOf(20);
        valorDois = BigDecimal.valueOf(10.35);
        resultado = valorUm.add(valorDois);

        Assertions.assertEquals(resultado,BigDecimal.valueOf(30.35));
    }

    @Test
    public void verificaSeSubtrai() {
        valorUm = BigDecimal.valueOf(50.30);
        valorDois = BigDecimal.valueOf(10.35);
        resultado = valorUm.subtract(valorDois);

        Assertions.assertEquals(resultado,BigDecimal.valueOf(39.95));
    }

    @Test
    public void verificaSeDivide() {
        valorUm = BigDecimal.valueOf(25);
        valorDois = BigDecimal.valueOf(5);
        try {
            resultado = valorUm.divide(valorDois);
        } catch (ArithmeticException e) {
            System.out.println("Zero na segunda não pode");
        }

        Assertions.assertEquals(resultado,BigDecimal.valueOf(5));
    }

    @Test
    public void verificaSeDividePorZero() {
        valorUm = BigDecimal.valueOf(25);
        valorDois = BigDecimal.valueOf(0);
        try {
            resultado = valorUm.divide(valorDois);
        } catch (ArithmeticException e) {
            System.out.println("Zero na segunda não pode");
        }

        Assertions.assertEquals(resultado, null);
    }

}