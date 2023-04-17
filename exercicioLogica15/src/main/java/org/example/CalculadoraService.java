package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class CalculadoraService {

    private static BigDecimal numeroUm;
    private static BigDecimal numeroDois;
    private static char operacao;
    private static BigDecimal resultado;

    static Scanner scan = new Scanner(System.in);

    public static void entradaDoUsuario() {

        System.out.println("Insira o primeiro número.");
        getNumero1();

        System.out.println("Insira a operação (+, -, *, /, ^)");
        getOperacao();

        System.out.println("Insira o segundo número.");
        getNumero2();

        switch (operacao){

            case '+' :
                calculaAdicao(numeroUm, numeroDois);
                System.out.println(numeroUm.toString() + " + " + numeroDois.toString() + " = " + resultado.toString());
                break;

            case '-' :
                calculaSubtracao(numeroUm, numeroDois);
                System.out.println(numeroUm.toString() + " - " + numeroDois.toString() + " = " + resultado.toString());
                break;

            case '*' :
                calculaMultiplicacao(numeroUm, numeroDois);
                System.out.println(numeroUm.toString() + " * " + numeroDois.toString() + " = " + resultado.toString());
                break;

            case '/' :
                calculaDivisao(numeroUm, numeroDois);
                System.out.println(numeroUm.toString() + " / " + numeroDois.toString() + " = " + resultado.toString());
                break;

            case '^' :
                calculaPotenciacao(numeroUm, numeroDois);
                System.out.println(numeroUm.toString() + " ^ " + numeroDois.toString() + " = " + resultado.toString());
                break;
        }


    }

    public static BigDecimal getNumero1() {

        numeroUm = scan.nextBigDecimal();

        return numeroUm;
    }

    public static char getOperacao() {

        String s = scan.next();

        if(s.length() > 0){
            operacao = s.charAt(0);}

        return operacao;
    }

    public static BigDecimal getNumero2(){

        numeroDois = scan.nextBigDecimal();

        return numeroDois;
    }

    public static BigDecimal calculaAdicao(BigDecimal numeroUm, BigDecimal numeroDois) {

        resultado = numeroUm.add(numeroDois);

        System.out.println(resultado);

        return resultado;
    }

    public static BigDecimal calculaSubtracao(BigDecimal numeroUm, BigDecimal numeroDois){

        resultado = numeroUm.subtract(numeroDois);

        System.out.println(resultado);

        return resultado;
    }

    public static BigDecimal calculaMultiplicacao(BigDecimal numeroUm, BigDecimal numeroDois){

        resultado = numeroUm.multiply(numeroDois);

        System.out.println(resultado);

        return resultado;
    }

    public static BigDecimal calculaDivisao(BigDecimal numeroUm, BigDecimal numeroDois){

        resultado = numeroUm.divide(numeroDois);

        System.out.println(resultado);

        return resultado;
    }

    public static BigDecimal calculaPotenciacao(BigDecimal numeroUm, BigDecimal numeroDois){


        resultado = numeroUm.pow((numeroDois).intValue());

        System.out.println(resultado);

        return resultado;
    }



}


