package org.example;

import org.junit.Assert;
import org.junit.Test;



public class AutomovelTest {

    Automovel automovel = new Automovel("Fiat", "Uno",160, "Automóvel");

    @Test
    public void testaGetMarca () {

        Assert.assertEquals("Fiat", automovel.getMarca());
    }

    @Test
    public void testaGetModelo () {

        Assert.assertEquals("Uno", automovel.getModelo());
    }

    @Test
    public void testaGetVelocidadeMaxima() {

        Assert.assertEquals(160, automovel.getVelocidadeMaxima());
    }

    @Test
    public void testaSetRodasEGetRodas() {

        automovel.setRodas(4);

        Assert.assertEquals(4,automovel.getRodas());
    }

    @Test
    public void testaGetTipo() {
        Assert.assertEquals("Automóvel", automovel.getTipo());
    }

}