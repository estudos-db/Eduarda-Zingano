package com.example.BibliotecaApi.mapper;

import com.example.BibliotecaApi.dto.request.AtualizarLocatarioRequestDTO;
import com.example.BibliotecaApi.dto.request.CadastraLocatarioRequestDTO;
import com.example.BibliotecaApi.dto.response.LocatarioResponseDTO;
import com.example.BibliotecaApi.model.Locatario;

public interface LocatarioMapper {

    static Locatario toLocatarioResponse(CadastraLocatarioRequestDTO cadastroLocatario){
        return Locatario.builder()
                .nome(cadastroLocatario.getNome())
                .genero(cadastroLocatario.getGenero())
                .telefone(cadastroLocatario.getTelefone())
                .email(cadastroLocatario.getEmail())
                .dataNascimento(cadastroLocatario.getDataNascimento())
                .cpf(cadastroLocatario.getCpf())
                .build();
    }
    static Locatario toLocatarioResponse(Locatario locatario, AtualizarLocatarioRequestDTO locatarioAtualizado){
        locatario.setNome(locatarioAtualizado.getNome());
        locatario.setGenero(locatarioAtualizado.getGenero());
        locatario.setTelefone(locatarioAtualizado.getTelefone());
        locatario.setEmail(locatarioAtualizado.getEmail());
        locatario.setDataNascimento(locatarioAtualizado.getDataNascimento());
        return locatario;
    }
    static LocatarioResponseDTO toLocatarioResponse(Locatario locatario){
        return LocatarioResponseDTO.builder()
                .nome(locatario.getNome())
                .genero(locatario.getGenero())
                .telefone(locatario.getTelefone())
                .dataNascimento(locatario.getDataNascimento())
                .build();
    }
}

