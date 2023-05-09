package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class NinjaDeGenjutsuTest {

    NinjaDeGenjutsu sasuke = new NinjaDeGenjutsu("Sasuke", 13, "Folha", 20 );

    @Test
    void retornaQueNinjaAtacou() {
        Assert.assertEquals("Sasuke está usando um jutsu de Genjutsu.", sasuke.usarJutsu());
    }

    @Test
    void retornaQueNinjaDesviou() {
        Assert.assertEquals("Sasuke está desviando de um ataque usando sua habilidade em Genjutsu.", sasuke.desviar());
    }
}