package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


import java.math.BigDecimal;


public class CalculadoraServiceTest {
    CalculadoraService calculadoraService = new CalculadoraService();
    BigDecimal valorUm;
    BigDecimal valorDois;

    @Test
    public void verificaSeSoma() {
        calculadoraService.Calcula(valorUm = BigDecimal.valueOf(5), valorDois = BigDecimal.valueOf(10), '+');
        BigDecimal resultado = calculadoraService.resultado;

        Assertions.assertEquals(resultado, BigDecimal.valueOf(15));
    }

    @Test
    public void verificaSeMultiplica() {
        calculadoraService.Calcula(valorUm = BigDecimal.valueOf(5), valorDois = BigDecimal.valueOf(15), '*');
        BigDecimal resultado = calculadoraService.resultado;

        Assertions.assertEquals(resultado, BigDecimal.valueOf(75));
    }

    @Test
    public void verificaSeSutrai() {
        calculadoraService.Calcula(valorUm = BigDecimal.valueOf(30), valorDois = BigDecimal.valueOf(15), '-');
        BigDecimal resultado = calculadoraService.resultado;

        Assertions.assertEquals(resultado, BigDecimal.valueOf(15));
    }

    @Test
    public void verificaSeDivide() {
        calculadoraService.Calcula(valorUm = BigDecimal.valueOf(25), valorDois = BigDecimal.valueOf(5), '/');
        BigDecimal resultado = calculadoraService.resultado;

        Assertions.assertEquals(resultado, BigDecimal.valueOf(5));
    }

    @Test
    public void verificaSeNaoDeixaDividirPorZero() {
        calculadoraService.Calcula(valorUm = BigDecimal.valueOf(25), valorDois = BigDecimal.valueOf(0), '/');
        BigDecimal resultado = calculadoraService.resultado;

        Assertions.assertEquals(resultado, null);
    }

}