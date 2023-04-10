package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MediaAlunoServiceTest {
    MediaAlunoService mediaAlunoService = new MediaAlunoService();
    @Test
    public void verificaSeMediaECalculada() {


        int mediaTeste = mediaAlunoService.calculaMedia();

        Assert.assertEquals(6, mediaTeste);
    }
    @Test
    public void verificaSeAtribuiStatusAluno() {

        String statusTeste = mediaAlunoService.statusAluno();

        String expect = "Verificiação suplementar.";

        Assert.assertEquals(expect, statusTeste);
    }

}