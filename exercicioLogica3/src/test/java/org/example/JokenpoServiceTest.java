package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;


public class JokenpoServiceTest {
    JokenpoService jokenpoService = new JokenpoService();
    Map iniciaJogo =  jokenpoService.jogadas(2, 0);

    @Test
    public void verificaSeEmpata() {


        var expect = iniciaJogo.get("jogador");
        var actual = iniciaJogo.get("maquina");

        Assert.assertEquals(expect, actual);
    }

        @Test
        public void verificaSeAlguemGanha() {
            var expect = iniciaJogo.get("jogador");
            var actual = iniciaJogo.get("maquina");

            Assert.assertNotEquals(expect, actual);




        }

}