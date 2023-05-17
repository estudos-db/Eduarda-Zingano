package com.example.BibliotecaApi.repository;

import com.example.BibliotecaApi.model.Aluguel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AluguelRepository extends JpaRepository<Aluguel, Long> {
    Optional<Aluguel> findByLocatarioNome(String locatario);

}
