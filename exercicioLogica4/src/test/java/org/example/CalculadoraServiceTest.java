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
        calculadoraService.calcula(valorUm = BigDecimal.valueOf(5), valorDois = BigDecimal.valueOf(10), '+');
        BigDecimal resultado = calculadoraService.resultado;

        Assertions.assertEquals(resultado, BigDecimal.valueOf(15));
    }

    @Test
    public void verificaSeMultiplica() {
        calculadoraService.calcula(valorUm = BigDecimal.valueOf(5), valorDois = BigDecimal.valueOf(15), '*');
        BigDecimal resultado = calculadoraService.resultado;

        Assertions.assertEquals(BigDecimal.valueOf(75), resultado);
    }

    @Test
    public void verificaSeSutrai() {
        calculadoraService.calcula(valorUm = BigDecimal.valueOf(30), valorDois = BigDecimal.valueOf(15), '-');
        BigDecimal resultado = calculadoraService.resultado;

        Assertions.assertEquals(BigDecimal.valueOf(15), resultado);
    }

    @Test
    public void verificaSeDivide() {
        calculadoraService.calcula(valorUm = BigDecimal.valueOf(25), valorDois = BigDecimal.valueOf(5), '/');
        BigDecimal resultado = calculadoraService.resultado;

        Assertions.assertEquals(BigDecimal.valueOf(5), resultado);
    }

    @Test
    public void verificaSeNaoDeixaDividirPorZero() {
        calculadoraService.calcula(valorUm = BigDecimal.valueOf(25), valorDois = BigDecimal.valueOf(0), '/');
        BigDecimal resultado = calculadoraService.resultado;

        Assertions.assertEquals(null, resultado);
    }

}
