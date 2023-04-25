package org.example;

public class Contato {
    private String nome;
    private int numero;
    private String rua;
    private String bairro;
    private String cidade;
    private String cep;

    public Contato(String nome, int numero, String rua, String bairro, String cidade, String cep) {
        this.nome = nome;
        this.numero = numero;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCep() {
        return cep;
    }
}
