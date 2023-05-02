package org.example;

public class NinjaDeTaijutsu extends Personagem implements Ninja {
    public NinjaDeTaijutsu(String nome, int idade, String aldeia, int chakra) {
        super(nome, idade, aldeia, chakra);
    }

    @Override
    public String usarJutsu() {
       String usar = getNome() + " está usando um golpe de Taijutsu.";
        return usar;
    }

    @Override
    public String desviar() {
       String desvia = getNome() + " está desviando de um ataque usando sua habilidade em Taijutsu.";
        return desvia;
    }
}
