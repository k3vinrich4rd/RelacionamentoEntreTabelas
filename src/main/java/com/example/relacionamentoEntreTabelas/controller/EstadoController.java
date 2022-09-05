package com.example.relacionamentoEntreTabelas.controller;

import com.example.relacionamentoEntreTabelas.model.EstadoModel;
import com.example.relacionamentoEntreTabelas.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/estados")
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @PostMapping
    public ResponseEntity<EstadoModel> cadastrarUmNovoEstado(@RequestBody EstadoModel estadoModel) {
        EstadoModel estados = estadoService.cadastrarEstado(estadoModel);
        return new ResponseEntity<>(estados, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<EstadoModel>> exibirEstadosCadastrados() {
        return ResponseEntity.ok(estadoService.exibirEstadosCadastrados());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<EstadoModel>> exibirEstadosViaId(@PathVariable Long id) {
        return ResponseEntity.ok(estadoService.exibirEstadosViaId(id));

    }


    @PutMapping(path = "/{id}")
    public ResponseEntity<EstadoModel> alterarEstadosCadastrados(@RequestBody EstadoModel estadoModel) {
        return ResponseEntity.ok(estadoService.alterarEstados(estadoModel));
    }

    @DeleteMapping(path = "/{id}")
    public void deletarEstados(@PathVariable Long id) {
        estadoService.deletarEstado(id);
    }

}
