package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;


public class TabuadaServiceTest {
    private TabuadaService tabuadaService = new TabuadaService();

    private List<Integer> arrayTeste = new ArrayList<>(List.of(5, 10, 15, 20, 25, 30, 35, 40, 45, 50));

    @Test
    public void verificaSeMultiplica() {
        Assertions.assertEquals(arrayTeste,tabuadaService.multiplica());
    }

}
