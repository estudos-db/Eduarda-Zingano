package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTrocoTest {

    @Test
    public void verificaSeCalculaTroco() {

        double actual = CalculadoraTroco.calculaTroco(100,50);

        Assert.assertEquals(50,actual,0 );
    }

}