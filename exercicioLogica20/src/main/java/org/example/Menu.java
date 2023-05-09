package org.example;

import java.util.Scanner;

public class Menu {

    public static int contador = 0;

    Scanner scanner = new Scanner(System.in);

    public void controlaMenu(){
        System.out.println("\nBem vindo ao sistema do Super Mercado");
        System.out.println("1 - Mostrar estoque");
        System.out.println("2 - Adicionar produto ao estoque");
        System.out.println("3 - Adicionar item ao pedido");
        System.out.println("4 - Mostrar pedido");
        System.out.println("5 - Pagar pedido");
        System.out.println("6 - Limpar carrinho");

        System.out.println("0 - Sair");
    }

    public void mostraEstoque(Estoque estoque){
        System.out.println("ESTOQUE:");
        estoque.imprimeCatalogoDoEstoque();
    }

    public void switchCase(int opcao, Pedido pedido, Scanner scan){
        Estoque estoque = Estoque.getInstance();
        switch(opcao){
            case 0 :
                System.out.println("Finalizando operação...");
                break;
            case 1 :
                mostraEstoque(estoque);
                break;
            case 2 :
                adicionaProdutoAoEstoque(scan);
                break;
            case 3 :
                pedido.adicionaItem();
                break;
            case 4 :
                mostrarPedido(pedido);
                break;
            case 5 :
                pagarPedido(pedido, scan);
                break;
            case 6 :
                limparPedido(pedido);
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    public static int gerarId(){
        contador ++;

        return contador;
    }

    public void adicionaProdutoAoEstoque(Scanner scan){
        System.out.println("Digite o nome do produto: ");
        String nome = scan.next();
        System.out.println("Digite o preco do produto: ");
        double preco = scan.nextDouble();
        System.out.println("Digite a quantidade: ");
        int quantidade = scan.nextInt();

        Produto produto = new Produto(gerarId(), nome, preco, quantidade);
        Estoque estoque = Estoque.getInstance();
        if(estoque.cadastrarProduto(produto)){
            System.out.println("Produto cadastrado com sucesso.");
        }else{
            System.out.println("Produto já existe no estoque.");
        }
    }

    public void mostrarPedido(Pedido pedido){
        if(!pedido.getListaDeItens().isEmpty()){
            pedido.imprimePedido();
            pedido.imprimeValorTotal();
        }else
            System.out.println("Não há items no pedido");
    }

    public void limparPedido(Pedido pedido){
        pedido.desfazerPedido();
        pedido.limparCarrinho();
        System.out.println("Carrinho limpo.");
    }

    public void pagarPedido(Pedido pedido, Scanner sc){
        if(!pedido.getListaDeItens().isEmpty()){
            System.out.println("Informe o valor fornecido: ");
            double pagamento = sc.nextDouble();

            if(pagamento < pedido.getValorTotalDoPedido()){
                System.out.println("Valor insuficiente.");
            }else{
                double troco = CalculadoraTroco.calculaTroco(pagamento, pedido.getValorTotalDoPedido());
                CalculadoraTroco.calculaNotasEMoedas(troco);
                pedido.limparCarrinho();
            }
        }else
            System.out.println("Não há items no pedido");
    }

}
