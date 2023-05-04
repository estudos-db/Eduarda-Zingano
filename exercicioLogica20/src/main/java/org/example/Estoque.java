package org.example;

import java.util.ArrayList;
import java.util.NoSuchElementException;


public class Estoque {
    private int id = 1;
    ArrayList<Produto> listaDeProdutos;

    private static Estoque instanciaEstoque = new Estoque();

    Estoque() {
        inicializarEstoque();
    }

    public static Estoque getInstance() {
        return instanciaEstoque;
    }

    public ArrayList inicializarEstoque(){
        listaDeProdutos = new ArrayList<Produto>();
        cadastrarProduto(new Produto(Menu.gerarId(), "CARNE MOIDA", 40, 100));
        cadastrarProduto(new Produto(Menu.gerarId(), "MACARRAO", 5, 50));
        cadastrarProduto(new Produto(Menu.gerarId(), "QUEIJO", 50, 200));
        cadastrarProduto(new Produto(Menu.gerarId(), "REFRIGERANTE", 8, 100));

        return listaDeProdutos;
    }

    public Produto encontraProduto(String nome){
        for(Produto produto : listaDeProdutos){
            if(produto.getNome().toUpperCase().equals(nome.toUpperCase()))
                return produto;
        }
        return null;
    }

    public Produto encontraProduto(int id){
        for(Produto produto : listaDeProdutos){
            if(produto.getId() == id)
                return produto;
        }
        return null;
    }

    public boolean cadastrarProduto(Produto produto){
        if(!this.listaDeProdutos.contains(encontraProduto(produto.getNome()))){
            this.listaDeProdutos.add(produto);
            return true;
        }
        else
            return false;
    }

    public void imprimeCatalogoDoEstoque(){
        listaDeProdutos.forEach(produto ->{
                    System.out.print("Produto ID: " + produto.getId());
                    System.out.print(" | Produto Nome : " + produto.getNome());
                    System.out.print(" | Preço : R$ " + produto.getPreco());
                    System.out.print(" | Quantidade em Estoque : " + produto.getQuantidadeEmEstoque() + "\n");
                }
        );
    }

    public boolean darBaixaNoEstoque(String nome, int quantidadeParaDarBaixa){
        Produto produto = encontraProduto(nome);

        if(produto.getQuantidadeEmEstoque() >= quantidadeParaDarBaixa){
            produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() - quantidadeParaDarBaixa);
            return true;
        }
        else
            return false;
    }


    public void darAltaNoEstoque(String nome, int quantidadeParaDarBaixa){
        Produto produto = encontraProduto(nome);
        produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() + quantidadeParaDarBaixa);
    }


    public int getQuantidadeAtualEmEstoque(Produto produto){
        return produto.getQuantidadeEmEstoque();
    }

    public int getPosicaoDoProdutoNaLista(Produto produto){
        return listaDeProdutos.indexOf(produto);
    }

    public boolean temEstoqueOuNao(Produto produto, int quantidadeParaDarBaixa){
        return getQuantidadeAtualEmEstoque(produto) >= quantidadeParaDarBaixa;
    }

}