package org.example;
import java.math.BigDecimal;
import java.util.Scanner;

public class Calculadora {
   public BigDecimal Calcula() {
      Scanner teclado = new Scanner(System.in);
      System.out.println("Escolha a operação que deseja fazer: +, - , /, *");

      String sinalTexto = teclado.nextLine();
      char sinal = sinalTexto.charAt(0);

      System.out.println("Digite o primeiro valor: ");
      BigDecimal num1 = BigDecimal.valueOf(teclado.nextDouble());

      System.out.println("Digite o segundo valor: ");
      BigDecimal num2 = BigDecimal.valueOf(teclado.nextDouble());

      teclado.close();

      switch (sinal) {
         case '*':
            System.out.println(num1 + "*" + num2 + "=" + (num1.multiply(num2)));
            break;
         case '+':
            System.out.println(num1 + "+" + num2 + "=" + (num1.add(num2)));
            break;
         case '-':
            System.out.println(num1 + "-" + num2 + "=" + (num1.subtract(num2)));
            break;
         case '/':
            if (num2.equals(0)) {
               System.out.println("Não é possível dividir, o segundo valor deve ser diferente de zero");
            } else {
               System.out.println(num1 + "/" + num2 + "=" + (num1.divide(num2)));
            }
            break;
         default:
            System.out.println("Sinal de operação inválido");
      }
      return null;}
   }