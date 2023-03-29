package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;



public class TabuadaServiceTest {

    TabuadaService tabuadaService = new TabuadaService();
    int numero = 5;
    int multiplicador;
    int resultadoFinal;
    @Test
 public void verificaSeMultiplica() {
        tabuadaService.multiplica(numero,multiplicador,resultadoFinal);
        int expect = numero * multiplicador;


        Assertions.assertEquals(expect,resultadoFinal);
    }

}