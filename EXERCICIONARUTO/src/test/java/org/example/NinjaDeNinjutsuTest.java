package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NinjaDeNinjutsuTest {

    NinjaDeNinjutsu sakura = new NinjaDeNinjutsu("Sakura", 14, "Folha", 35);

    @Test
    void retornaQueNinjaAtacou() {
        Assert.assertEquals("Sakura está usando um jutsu de Ninjutsu.", sakura.usarJutsu());
    }

    @Test
    void retornaQueNinjaDesviou() {
        Assert.assertEquals("Sakura está desviando de um ataque usando sua habilidade em Ninjutsu.", sakura.desviar());
    }

}