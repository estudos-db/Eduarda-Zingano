package org.example;

public class ControleEstoque {
    private Estoque estoque;

    public ControleEstoque() {
        this.estoque = new Estoque();
    }

    public void adicionarProduto(String nome, int codigo, double preco, int quantidade) {
        Produto produto = new Produto(codigo, nome, preco, quantidade);

    }
}