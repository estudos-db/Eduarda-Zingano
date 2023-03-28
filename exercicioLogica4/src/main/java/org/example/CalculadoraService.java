package org.example;
import java.math.BigDecimal;


public class CalculadoraService {

    BigDecimal resultado;

    public void calcula(BigDecimal valorUm, BigDecimal valorDois, char sinal) {

        switch (sinal) {
            case '*':
                resultado = (valorUm.multiply(valorDois));
                System.out.println(valorUm + " * " + valorDois + " = " + resultado);
                break;
            case '+':
                resultado =  (valorUm.add(valorDois));
                System.out.println(valorUm + " + " + valorDois + " = " + resultado);
                break;
            case '-':
                resultado = (valorUm.subtract(valorDois));
                System.out.println(valorUm + " - " + valorDois + " = " + resultado);
                break;
            case '/':
                resultado = valorUm.divide(valorDois);
                System.out.println(valorUm + " / " + valorDois + " = " + resultado);
                break;
        }
    }


}
