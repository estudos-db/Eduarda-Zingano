package org.example;

public class NinjaDeNinjutsu extends Personagem implements Ninja {

    public NinjaDeNinjutsu(String nome) {
        super(nome);
    }

    @Override
    public Boolean desviar(Personagem personagem,String nomeDoJutsu, Personagem inimigo) {
        System.out.println(inimigo.getNome() + " está usando um golpe de Ninjutsu.");

        System.out.println(personagem.getNome() + " está desviando de um ataque!");
        if (personagem.getVida() <= 0){
            System.out.println(personagem.getNome() + " já foi derrotado");
        } else if (Math.random() < 0.5) {
            System.out.println(personagem.getNome() + " conseguiu desviar com sucesso!");
            return true;
        }else {
            System.out.println(personagem.getNome() + " não conseguiu desviar e sofreu um dano!");
        }
        return false;
    }

    @Override
    public Boolean usarJutsu(Personagem personagem, String nomeDoJutsu, Personagem inimigo, boolean desviar) {
        if (getChakra() == 0){
            System.out.println("Não há chakra suficiente para usar este jutsu! " + personagem.getNome() + " perdeu.");
        }else if(inimigo.getVida() <= 0){
            inimigo.setVida(0);
            System.out.println(inimigo.getNome() + " foi derrotado!");
        } else if (desviar == false && getChakra() >= getJutsus().get(nomeDoJutsu).getConsumoDeChakra() && inimigo.getVida() > 0) {
            inimigo.setVida(inimigo.getVida() - getJutsus().get(nomeDoJutsu).getDano());
            setChakra(getChakra() - getJutsus().get(nomeDoJutsu).getConsumoDeChakra());
            System.out.println(personagem.getNome() + " está usando o jutsu: " + nomeDoJutsu);
            return true;
        }

        return false;
    }

}

