package org.example;

public class Pai extends Pessoa{

    public String [] pai () {

        nome = "José";

        idade = "52";

        nomePai = "Erick";

        nomeMae = "Eduarda";

        nomeFilho = "Cláudio";

        String [] arrPai = new String[] {"Nome: " + nome, "Idade: " + idade,"Nome do pai: " + nomePai,"Nome da mãe: " + nomeMae, "Nome do Filho: " + nomeFilho};

        return arrPai;
    }

}
