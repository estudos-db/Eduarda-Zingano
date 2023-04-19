package org.example;

import org.junit.Assert;
import org.junit.Test;



public class AgendaTest {
    private Contato contato = new Contato();

    private Endereco endereco = new Endereco();
    private Agenda agenda = new Agenda(contato, endereco);



    @Test
    public void verificaSeAdicionaContato() {
        agenda.adicionarContato("Cláudio", 123344565, "Estr. João de Oliveira Remião", "Agronomia", "Porto Alegre", "91550000");
        agenda.adicionarContato("Raimundo", 40028922, "São Joaquim", "Liberdade", "São Paulo", "01508001");

        Assert.assertEquals(2, contato.getContatosNomes().size());
    }

    @Test
    public void verificaSeTemAlgoNoContato() {
        agenda.adicionarContato("Cláudio", 123344565, "Estr. João de Oliveira Remião", "Agronomia", "Porto Alegre", "91550000");

        Assert.assertEquals("Cláudio", contato.getContatosNomes().get(0));
    }

    @Test
    public void verificaSeDeletaContato() {
        agenda.adicionarContato("Cláudio", 123344565, "Estr. João de Oliveira Remião", "Agronomia", "Porto Alegre", "91550000");
        agenda.adicionarContato("Raimundo", 40028922, "São Joaquim", "Liberdade", "São Paulo", "01508001");

        agenda.removerContato(1);
        Assert.assertEquals(1, contato.getContatosNomes().size());
    }

}