package org.example;

import org.junit.Assert;
import org.junit.Test;


public class JokenpoServiceTest {
    JokenpoService jokenpoService = new JokenpoService();
    private boolean resultado = false;

    @Test
    public void verificaSeJogoRoda() {

        if (jokenpoService.jogada() != 0){
            resultado = true;
        }

        Assert.assertTrue(resultado);

    }

}