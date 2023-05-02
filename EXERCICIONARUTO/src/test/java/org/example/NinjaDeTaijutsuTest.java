package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class NinjaDeTaijutsuTest {

    NinjaDeTaijutsu lee = new NinjaDeTaijutsu("Lee", 15, "Folha", 30);

    @Test
    void retornaQueNinjaAtacou() {
        Assert.assertEquals("Lee está usando um golpe de Taijutsu.", lee.usarJutsu());
    }

    @Test
    void retornaQueNinjaDesviou() {
        Assert.assertEquals("Lee está desviando de um ataque usando sua habilidade em Taijutsu.", lee.desviar());
    }

}