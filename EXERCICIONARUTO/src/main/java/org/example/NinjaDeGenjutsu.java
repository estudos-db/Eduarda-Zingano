package org.example;

public class NinjaDeGenjutsu extends Personagem implements Ninja {
    public NinjaDeGenjutsu(String nome, int idade, String aldeia, int chakra) {
        super(nome, idade, aldeia, chakra);
    }

    @Override
    public String usarJutsu() {
        String usar = getNome() + " está usando um jutsu de Genjutsu.";
        return usar;
    }

    @Override
    public String desviar() {
        String desvia = getNome() + " está desviando de um ataque usando sua habilidade em Genjutsu.";
        return desvia;
    }
}
