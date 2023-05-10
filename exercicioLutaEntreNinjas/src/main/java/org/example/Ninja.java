package org.example;

public interface Ninja {
    Boolean usarJutsu(Personagem personagem, String nomeDoJutsu, Personagem inimigo, boolean desviar);
    Boolean desviar(Personagem personagem,String nomeDoJutsu, Personagem inimigo);

}
