package com.example.BibliotecaApi.controller;

import com.example.BibliotecaApi.dto.request.AluguelRequestDTO;
import com.example.BibliotecaApi.dto.response.AluguelResponseDTO;
import com.example.BibliotecaApi.model.Aluguel;
import com.example.BibliotecaApi.service.impl.AluguelServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluguel")
public class AluguelController {
    private final AluguelServiceImpl aluguelService;
    @Autowired
    public AluguelController(AluguelServiceImpl aluguelService) {
        this.aluguelService = aluguelService;
    }

    @PostMapping
    public ResponseEntity<Aluguel> salvarAluguel(@RequestBody @Valid AluguelRequestDTO cadastroAluguel){
        return new ResponseEntity<>(aluguelService.salvar(cadastroAluguel), HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<AluguelResponseDTO> buscarAluguelPorId(@PathVariable Long id){
        return new ResponseEntity<>(aluguelService.buscarPorId(id), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<AluguelResponseDTO> buscarAluguelPorNomeDoLocador(@RequestParam String nome){
        return new ResponseEntity<>(aluguelService.buscarPorNomeDoLocador(nome), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deletarAluguel(@PathVariable Long id){
        aluguelService.deletarAluguel(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

