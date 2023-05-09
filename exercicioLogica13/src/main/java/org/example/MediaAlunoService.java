package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MediaAlunoService {

    public int calculaMedia () {

        List <Integer> notas = new ArrayList<>();

        notas.add(6);
        notas.add(6);
        notas.add(6);

        int media = (notas.get(0) + notas.get(1) + notas.get(2)) / 3;

        System.out.println("A média do aluno é: " + media);

        return media;

    }

    public String statusAluno() {
        String status;

        int mediaAluno = calculaMedia();

        if (mediaAluno > 6) {
            status = String.valueOf(Status.APROVADO.getDescricao());
        } else if (mediaAluno >= 4 && mediaAluno <= 6) {
            status = String.valueOf(Status.VERIFICACAO.getDescricao());
        } else {
            status = String.valueOf(Status.REPROVADO.getDescricao());
        }

        System.out.println("O status do aluno é: " + status);

        return status;
    }
}
