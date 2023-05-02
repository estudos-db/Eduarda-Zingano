package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;

public class CalculadoraTrocoTest {

    @Test
    public void verificaSeCalculaTroco() {

        double actual = CalculadoraTroco.calculaTroco(100,50);

        Assert.assertEquals(50,actual,0 );
    }

    @Test
    public void calculaNotaEMoeda() {
        Map<Number,Number> expect = new HashMap<>();
        expect.put(3,0);

        Assert.assertThat((expect),is(CalculadoraTroco.calculaNotasEMoedas(45)));
    }

}