package com.example.BibliotecaApi.provider;

import com.example.BibliotecaApi.dto.request.AutorRequestDTO;
import com.example.BibliotecaApi.model.Autor;

import java.time.Year;

public class AutorProvider {

    public static final AutorRequestDTO AUTOR_REQUEST_DTO = new AutorRequestDTO("Autor A", "Masculino", Year.of(2000), "027-300-600");

    public static final Autor AUTOR_A = new Autor(1L,"Autor A", "Masculino", Year.of(2000), "027-300-600");

}
