package org.example;

import org.junit.Assert;
import org.junit.Test;



public class AgendaTest {
    private Agenda agenda = new Agenda();



    @Test
    public void verificaSeAdicionaContato() {
        agenda.adicionarContato(new Contato("Cláudio", "123344565", "Estr. João de Oliveira Remião", "Agronomia", "Porto Alegre", "91550000"));
        agenda.adicionarContato(new Contato("Raimundo", "40028922", "São Joaquim", "Liberdade", "São Paulo", "01508001"));

        Assert.assertEquals(2, agenda.getContatos().size());
    }

    @Test
    public void verificaSeTemAlgoNoContato() {
        agenda.adicionarContato(new Contato("Cláudio", "123344565", "Estr. João de Oliveira Remião", "Agronomia", "Porto Alegre", "91550000"));

        Assert.assertTrue(agenda.getContatos().stream().anyMatch(contato -> contato.getNome().contains("Cláudio")));
    }

    @Test
    public void verificaSeDeletaContato() {
        agenda.adicionarContato(new Contato("Cláudio", "123344565", "Estr. João de Oliveira Remião", "Agronomia", "Porto Alegre", "91550000"));
        agenda.adicionarContato(new Contato("Raimundo","40028922", "São Joaquim", "Liberdade", "São Paulo", "01508001"));

        agenda.removerContato(1);
        Assert.assertEquals(1, agenda.getContatos().size());
    }

}