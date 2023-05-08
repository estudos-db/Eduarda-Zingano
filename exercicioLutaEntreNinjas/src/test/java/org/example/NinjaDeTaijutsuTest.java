package org.example;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class NinjaDeTaijutsuTest {

    NinjaDeTaijutsu neji = new NinjaDeTaijutsu("Neji");
    NinjaDeTaijutsu gaara = new NinjaDeTaijutsu("Gaara");



    @Test
    void verificaSeUsaJutsuSemChakra() {
        Jutsu jutsuNeji = new Jutsu("Oito Trigramas Sessenta e Quatro Palmas",65, 101);
        neji.adicionarJutsu("Oito Trigramas Sessenta e Quatro Palmas", jutsuNeji);

        Assert.assertFalse(neji.usarJutsu(neji, jutsuNeji, gaara));
    }

    @Test
    void verificaSeTiraVidaDoInimigo() {
        Jutsu jutsuNeji = new Jutsu("Oito Trigramas Sessenta e Quatro Palmas",80, 10);
        neji.adicionarJutsu("Oito Trigramas Sessenta e Quatro Palmas", jutsuNeji);
        neji.usarJutsu(neji, jutsuNeji, gaara);

        Assert.assertEquals(20, gaara.getVida());
    }


}