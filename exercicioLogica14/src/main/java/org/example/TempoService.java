package org.example;

import java.util.Scanner;

public class TempoService {

  private  int valor;


    public int segundosDoUsuario() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de segundos a ser calculada.");

        valor = scan.nextInt();

        return this.valor;
    }

    public int calculoSegundosEmSegundos(int valor) {


        int segundos = (valor % 3600) % 60;

        return segundos;
    }

    public int calculoSegundosEmMinutos(int valor){


        int minutos = (valor % 3600) / 60;


        return minutos;
    }

    public int calculoSegundosEmHoras (int valor) {


        int horas = valor / 3600;


        return horas;
    }

    public String resultadoCalculos () {

        String resultado = "Tempo calculado: " + calculoSegundosEmHoras(valor) + "h" + " " + calculoSegundosEmMinutos(valor) + "m" + " " + calculoSegundosEmSegundos(valor) + "s";


        System.out.println(resultado);


        return resultado;
    }

}
