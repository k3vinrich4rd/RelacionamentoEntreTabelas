package com.example.relacionamentoEntreTabelas.controller;

import com.example.relacionamentoEntreTabelas.model.ClienteModel;
import com.example.relacionamentoEntreTabelas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<ClienteModel> cadastrarClienteNovo(@RequestBody ClienteModel clienteModel) {
        ClienteModel cliente = clienteService.cadastrarCliente(clienteModel);
        return new ResponseEntity<>(cliente, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ClienteModel>> exibirClientesCadastrados() {
        return ResponseEntity.ok(clienteService.exibirTodosClientes());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<ClienteModel>> exibirClientesViaId(@PathVariable Long id) {
        return ResponseEntity.ok(clienteService.exibirClientesViaId(id));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<ClienteModel> alterarClienteCadastrado(@RequestBody ClienteModel clienteModel) {
        return ResponseEntity.ok(clienteService.alterarCadastrado(clienteModel));
    }

    @DeleteMapping(path = "/{id}")
    public void deletarClienteCadastrado(@PathVariable Long id) {
        clienteService.deletarCadastro(id);
    }
}
