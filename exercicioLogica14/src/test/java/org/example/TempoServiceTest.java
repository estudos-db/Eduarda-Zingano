package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TempoServiceTest {
    TempoService ts = new TempoService();
    @Test
    public void verificaCalculoSegundos() {


        Assert.assertEquals(50, ts.calculoSegundosEmSegundos(50));
    }

    @Test
    public void verificaCalculoMinutos() {


        Assert.assertEquals(3, ts.calculoSegundosEmMinutos(180));
    }

    @Test
    public void verificaCalculoHoras() {


        Assert.assertEquals(2, ts.calculoSegundosEmHoras(7200));
    }
}