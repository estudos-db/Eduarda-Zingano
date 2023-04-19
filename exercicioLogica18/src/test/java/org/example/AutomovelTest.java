package org.example;

import org.junit.Assert;
import org.junit.Test;



public class AutomovelTest {

  private Carro carro = new Carro("Fiat", "Uno",160, "Automóvel");

    @Test
    public void testaGetMarca () {

        Assert.assertEquals("Fiat", carro.getMarca());
    }

    @Test
    public void testaGetModelo () {

        Assert.assertEquals("Uno", carro.getModelo());
    }

    @Test
    public void testaGetVelocidadeMaxima() {

        Assert.assertEquals(160, carro.getVelocidadeMaxima());
    }

    @Test
    public void testaSetRodasEGetRodas() {

        carro.setRodas(4);

        Assert.assertEquals(4,carro.getRodas());
    }

    @Test
    public void testaGetTipo() {

        Assert.assertEquals("Automóvel", carro.getTipo());
    }

    @Test
    public void verificaSeMotoPartidaPedalLiga() {
       MotoPartidaPedal motoPartida = new MotoPartidaPedal("Yamaha", "Fazer", 150, "moto" );

       Assert.assertTrue(motoPartida.condicaoLigarMoto());

    }

    @Test
    public void verificaSeCarroAutomaticaNaoLiga() {
       CarroAutomatico carroAutomatico = new CarroAutomatico("Toyota", "Corolla", 210, "carro");

        Assert.assertFalse(carroAutomatico.condicaoLigarCarro());

    }

    @Test
    public void verificaSeGuinchoSoGuinchaCarroEMoto() {
        Guincho guincho = new Guincho("Volvo", "FH 540", 170, "Guincho");

        Assert.assertFalse(guincho.guincharAutomovel(guincho));

    }

}