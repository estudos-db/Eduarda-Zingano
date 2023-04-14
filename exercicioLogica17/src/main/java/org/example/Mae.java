package org.example;

public class Mae extends Pessoa{

    public String [] mae () {

        nome = "Joana";

        idade = "50";

        nomePai = "João";

        nomeMae = "Maria";

        nomeFilho = "Cláudio";

        String [] arrMae = new String[] {"Nome: " + nome, "Idade: " + idade,"Nome do pai: " + nomePai,"Nome da mãe: " + nomeMae, "Nome do Filho: " + nomeFilho};

        return arrMae;
    }

}
