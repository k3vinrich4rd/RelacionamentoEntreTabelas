package com.example.relacionamentoEntreTabelas.controller;

import com.example.relacionamentoEntreTabelas.model.EnderecoModel;
import com.example.relacionamentoEntreTabelas.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping
    public ResponseEntity<EnderecoModel> cadastrarEndereco(@RequestBody EnderecoModel enderecoModel) {
        EnderecoModel enderecos = enderecoService.cadastrarEndereco(enderecoModel);
        return new ResponseEntity<>(enderecos, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<EnderecoModel>> exibirTodosEnderecos() {
        return ResponseEntity.ok(enderecoService.exibirTodosEnderecos());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<EnderecoModel>> exibirEnderecoViaId(@PathVariable Long id) {
        return ResponseEntity.ok(enderecoService.exibirViaId(id));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<EnderecoModel> alterarEnderecosCadastrados(@RequestBody EnderecoModel enderecoModel) {
        return ResponseEntity.ok(enderecoService.alterarEnderecos(enderecoModel));
    }

    @DeleteMapping(path = "/{id}")
    public void deletarEnderecoCadastrado(@PathVariable Long id) {
        enderecoService.deletarEndereco(id);
    }
}
