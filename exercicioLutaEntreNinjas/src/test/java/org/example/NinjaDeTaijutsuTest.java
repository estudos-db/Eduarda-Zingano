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

        Assert.assertFalse(neji.usarJutsu(neji, jutsuNeji.getNome(), gaara, gaara.desviar(gaara, jutsuNeji.getNome(), neji)));
    }


    @Test
    void verificaSeTiraVidaDoInimigo() {
        Jutsu jutsuNeji = new Jutsu("Oito Trigramas Sessenta e Quatro Palmas",65, 10);
        neji.adicionarJutsu("Oito Trigramas Sessenta e Quatro Palmas", jutsuNeji);
        neji.usarJutsu(neji, jutsuNeji.getNome(), gaara, gaara.desviar(gaara, jutsuNeji.getNome(), neji));

        Assert.assertEquals(35, gaara.getVida());
    }


}