package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class EstoqueTest {
    Estoque estoque;


    @BeforeEach
    void inicializarEstoque(){
        this.estoque = Estoque.getInstance();

        estoque.cadastrarProduto(new Produto(Menu.gerarId(), "REFRIGERANTE", 8, 100));

    }


    @Test
  public void verificaSeCadastraProduto() {

        estoque.cadastrarProduto(new Produto(Menu.gerarId(), "CEBOLA", 3, 100));

        Assert.assertEquals(5,estoque.listaDeProdutos.size());
    }

    @Test
   public void verificasSeDaBaixaEmEstoque(){


        Assert.assertTrue(estoque.darBaixaNoEstoque("REFRIGERANTE", 50));



    }

    @Test
   public void verificaSeDaAltaEmEstoque() {

        estoque.darBaixaNoEstoque("MACARRAO", 50);

        estoque.darAltaNoEstoque("MACARRAO", 25);

        Produto quantidade = estoque.listaDeProdutos.get(1);

        Assert.assertEquals(25,estoque.getQuantidadeAtualEmEstoque(quantidade));
    }

    @Test
   public void verificaSeEncontraProdutoPeloNome () {
        Produto produto = estoque.encontraProduto("MACARRAO");;

        Assert.assertEquals(produto, estoque.encontraProduto("MACARRAO"));
    }

    @Test
   public void verificaSeEncontraProdutoPeloID () {
        Produto produto = estoque.encontraProduto(1);;

        Assert.assertEquals(produto, estoque.encontraProduto(1));
    }


}