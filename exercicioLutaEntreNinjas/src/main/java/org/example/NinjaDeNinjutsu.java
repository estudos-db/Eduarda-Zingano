package org.example;

public class NinjaDeNinjutsu extends Personagem implements Ninja {

    public NinjaDeNinjutsu(String nome) {
        super(nome);
    }

    @Override
    public Boolean usarJutsu(Personagem personagem, Jutsu jutsu, Personagem inimigo) {
        System.out.println(getNome() + " está usando um golpe de Ninjutsu.");
        if (getChakra() >= jutsu.getConsumoDeChakra() && inimigo.getVida() > 0) {
           inimigo.setVida(inimigo.getVida() - jutsu.getDano());
            setChakra(getChakra() - jutsu.getConsumoDeChakra());
            System.out.println(personagem.getNome() + " está usando o jutsu: " + jutsu.getNome());
            return true;
        }else if(inimigo.getVida() <= 0){
            inimigo.setVida(0);
            System.out.println(inimigo.getNome() + " foi derrotado!");
        } else {
            System.out.println("Não há chakra suficiente para usar este jutsu! " + personagem.getNome() + " perdeu.");
        }

        return false;
    }

    @Override
    public Boolean desviar(Personagem personagem,Jutsu jutsu, Personagem inimigo) {
        System.out.println(personagem.getNome() + " está desviando de um ataque!");
        if (personagem.getVida() <= 0){
            System.out.println(personagem.getNome() + " já foi derrotado");
        } else if (Math.random() < 0.5) {
            System.out.println(personagem.getNome() + " conseguiu desviar com sucesso!");
            setVida(personagem.getVida() + jutsu.getDano());
            return true;
        }else {
            System.out.println(personagem.getNome() + " não conseguiu desviar e sofreu um dano!");
            System.out.println("A vida atual é: " + personagem.getVida());
        }
        System.out.println(personagem.getVida());
        return false;
    }
}

