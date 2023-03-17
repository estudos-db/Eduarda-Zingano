package org.example;

import java.math.BigDecimal;

public class ProdutoService {

    public BigDecimal calculaDesconto(Integer quantidade, String nome, BigDecimal preco) {
        if(quantidade > 0 && quantidade <= 10) {
            System.out.println(nome + " no total de " + preco);
            return preco;
        } else if (quantidade <= 20) {
            BigDecimal desconto = (preco.multiply(new BigDecimal("0.10")));
            BigDecimal valorFinal = (preco.subtract(desconto));
            System.out.println(nome + " no total de " + preco + " com desconto de " + desconto + " com valor final de " + valorFinal);
            return valorFinal;
        } else if (quantidade <=50) {
            BigDecimal desconto = (preco.multiply(new BigDecimal("0.20")));
            BigDecimal valorFinal = (preco.subtract(desconto));
            System.out.println(nome + " no total de " + preco + " com desconto de " + desconto + " com valor final de " + valorFinal);
            return valorFinal;
        } else {
            BigDecimal desconto = (preco.multiply(new BigDecimal("0.25")));
            BigDecimal valorFinal = (preco.subtract(desconto));
            System.out.println(nome + " no total de " + preco + " com desconto de " + desconto + " com valor final de " + valorFinal);
            return valorFinal;
        }
    }
}
