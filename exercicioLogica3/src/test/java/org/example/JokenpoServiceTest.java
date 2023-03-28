package org.example;

import org.junit.Assert;
import org.junit.Test;


public class JokenpoServiceTest {

    JokenpoService jokenpoService = new JokenpoService();
    int jogador;
    @Test
    public void verificaSeEmpata() {

        jokenpoService.jogadas(jogador = 2);
        boolean resultado = false;
        if(jogador == jokenpoService.maquina) {
            resultado = true;
        }

        Assert.assertTrue(resultado);
    }

    @Test
    public void verificaSeAlguemGanha() {

        jokenpoService.jogadas(jogador = 3);
        boolean resultado = false;
        if(jogador != jokenpoService.maquina) {
            resultado = true;
        }

        Assert.assertTrue(resultado);
    }

}