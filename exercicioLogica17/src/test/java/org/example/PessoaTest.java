package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PessoaTest {

    private  Filho filho = new Filho();

    private Mae mae = new Mae();

    private Pai pai = new Pai();

    @Test
    void verificaSeAtributosFilhoNaoEstaVazio(){
        mae.mae();
        pai.pai();
        filho.filho();

        boolean arrCheio = false;

        String[] arrFilho = new String[] {filho.nome, filho.idade, filho.nomePai, filho.nomeMae};

        for (int i = 0; i < arrFilho.length; i++){
            if (arrFilho[i] != null){
                arrCheio = true;
                System.out.println(arrFilho[i]);
            }
        }

        Assert.assertTrue(arrCheio);
    }

    @Test
    void verificaSeAtributosMaeNaoEstaVazio(){
        mae.mae();
        pai.pai();
        filho.filho();

        boolean arrCheio = false;

        String[] arrMae = new String[] {mae.nome, mae.idade, mae.nomeMae, mae.nomePai, mae.nomeFilho};

        for (int i = 0; i < arrMae.length; i++){
            if (arrMae[i] != ""){
                arrCheio = true;
                System.out.println(arrMae[i]);
            }
        }

        Assert.assertTrue(arrCheio);
    }

    @Test
    void verificaSeAtributosPaiNaoEstaVazio(){
        mae.mae();
        pai.pai();
        filho.filho();

        boolean arrCheio = false;

        String[] arrPai = new String[] {pai.nome, pai.idade, pai.nomePai, pai.nomeMae, pai.nomeFilho};

        for (int i = 0; i < arrPai.length; i++){
            if (arrPai[i] != ""){
                arrCheio = true;
                System.out.println(arrPai[i]);
            }
        }

        Assert.assertTrue(arrCheio);
    }

}