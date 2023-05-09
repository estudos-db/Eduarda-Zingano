package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;


public class AgendaTest {
    private Contato contato =  new Contato("Raimundo", "40028922", "São Joaquim", "Liberdade", "São Paulo", "01508001");
    private Agenda agenda = new Agenda(new ArrayList<>(Arrays.asList(contato)));


    @Test
    public void verificaSeAdicionaContato() {
        agenda.adicionarContato(contato);

        Assert.assertEquals(1, agenda.getContatos().size());
    }

    @Test
    public void verificaSeTemAlgoNoContato() {
        agenda.adicionarContato(contato);

        Assert.assertTrue(agenda.getContatos().stream().anyMatch(contato -> contato.getNome().contains("Raimundo")));
    }

    @Test
    public void verificaSeDeletaContato() {
        agenda.adicionarContato(contato);

        agenda.removerContato(0);
        Assert.assertEquals(0, agenda.getContatos().size());
    }

}