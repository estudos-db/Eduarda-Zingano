package org.example;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PersonagemTest {
 Personagem naruto = new Personagem("Naruto", 14, "Folha", 50);

    @Test
  void deveadicionarJutsuALista() {
     naruto.adicionarJutsu("Clones das sombras");

     Assert.assertEquals(1, naruto.getJutsus().length);
    }

    @Test
  void deveAumentarChackra(){
    naruto.aumentarChakra(5);

    Assert.assertEquals(55, naruto.getChakra() );
  }

  @Test
 void deveMostrarInformacoes() {
        naruto.adicionarJutsu("Rasengan");
     Assert.assertEquals("Nome: Naruto" +
                                  "Idade: 14" +
                                  "Aldeia: Folha" +
                                  "Jutsus: [Rasengan]" +
                                  "Chakra: 50", naruto.exibirInformacoes());
  }
}