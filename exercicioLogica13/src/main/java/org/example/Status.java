package org.example;

public enum Status {
    APROVADO("Aprovado."),
    VERIFICACAO("Verificiação suplementar."),
    REPROVADO("Reprovado.");

    private String descricao;

    Status(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
