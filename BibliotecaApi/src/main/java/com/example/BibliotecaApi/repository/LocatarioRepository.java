package com.example.BibliotecaApi.repository;

import com.example.BibliotecaApi.model.Locatario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LocatarioRepository extends JpaRepository<Locatario, Long> {
    Optional<Locatario> findByNome(String nome);
}
