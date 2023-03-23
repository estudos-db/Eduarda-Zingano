package org.example;
import java.math.BigDecimal;


public class CalculadoraService {

    BigDecimal resultado;

    public void Calcula(BigDecimal valorUm, BigDecimal valorDois, char sinal) {

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
                try {
                    resultado = valorUm.divide(valorDois);
                    System.out.println(valorUm + " / " + valorDois + " = " + resultado);
                } catch (ArithmeticException e) {
                    System.out.println("Não é possível dividir, o segundo valor deve ser diferente de zero");
                }
                break;
        }
    }


}
