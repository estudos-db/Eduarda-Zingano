package org.example;

import org.junit.Assert;
import org.junit.Test;


public class MainTest {
    int jogador;
    int maquina;
    @Test
    public void verificaEmpate() {
      jogador = 2;
      maquina = 2;

      boolean expect = jogador == maquina;
      boolean actual = true;

      Assert.assertEquals(expect, actual);
    }

    @Test
    public void verificaSeJogadorGanha() {
        jogador = 1;
        maquina = 3;
        boolean vitoriaJogador = false;

        if (jogador == 1 && maquina == 3) {
            vitoriaJogador = true;
        }else if(jogador == 2 && maquina == 1){
            vitoriaJogador = true;
        } else if (jogador == 3 && maquina == 2) {
            vitoriaJogador = true;
        }else {
            vitoriaJogador = false;
        };

        boolean expect = true;
        boolean actual = vitoriaJogador;

        Assert.assertEquals(expect, actual);

    }

    @Test
    public void verificaMaquinaGanha() {
        jogador = 3;
        maquina = 1;
        boolean vitoriaMaquina = false;

        if (jogador == 3 && maquina == 1) {
            vitoriaMaquina = true;
        }else if(jogador == 1 && maquina == 2){
            vitoriaMaquina = true;
        } else if (jogador == 2 && maquina == 3) {
            vitoriaMaquina = true;
        }else {
            vitoriaMaquina = false;
        };

        boolean expect = true;
        boolean actual = vitoriaMaquina;

        Assert.assertEquals(expect, actual);
    }
}