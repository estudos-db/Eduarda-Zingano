package com.example.BibliotecaApi.mapper;

import com.example.BibliotecaApi.dto.response.AluguelResponseDTO;
import com.example.BibliotecaApi.model.Aluguel;
import com.example.BibliotecaApi.model.Livro;
import com.example.BibliotecaApi.model.Locatario;

import java.util.List;

public interface AluguelMapper {

    static Aluguel toAluguel(List<Livro> livrosAchados, Locatario locatarioEncontrado){
        return Aluguel.builder()
                .livros(livrosAchados)
                .locatario(locatarioEncontrado)
                .build();
    }


    static AluguelResponseDTO toAluguelResponse(Aluguel aluguel) {
        return AluguelResponseDTO.builder()
                .dataRetirada(aluguel.getDataRetirada())
                .dataDevolucao(aluguel.getDataDevolucao())
                .livros(aluguel.getLivros().stream().map(LivroMapper::toLivroResponse).toList())
                .locatario(LocatarioMapper.toLocatarioResponse(aluguel.getLocatario()))
                .build();
    }
}

