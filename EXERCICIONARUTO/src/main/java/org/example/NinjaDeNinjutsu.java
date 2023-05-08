package org.example;

public class NinjaDeNinjutsu extends Personagem implements Ninja {
    public NinjaDeNinjutsu(String nome, int idade, String aldeia, int chakra) {
        super(nome, idade, aldeia, chakra);
    }

    @Override
    public String usarJutsu() {
        String usar = getNome() + " está usando um jutsu de Ninjutsu.";
        return usar;
    }

    @Override
    public String desviar() {
        String desvia = getNome() + " está desviando de um ataque usando sua habilidade em Ninjutsu.";
        return desvia;
    }
}

