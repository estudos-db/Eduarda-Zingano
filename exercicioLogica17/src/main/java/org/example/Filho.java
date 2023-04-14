package org.example;

public class Filho extends Pessoa{

    public String [] filho (){

        nome = "Cláudio";

        idade = "25";

        nomePai = "José";

        nomeMae = "Joana";

        nomeFilho = "";

        String [] arrFilho = new String[] {"Nome: " + nome, "Idade: " + idade,"Nome do pai: " + nomePai,"Nome da mãe: " + nomeMae};



        return arrFilho;
    }
}
