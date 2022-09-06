package com.example.relacionamentoEntreTabelas.controller;

import com.example.relacionamentoEntreTabelas.model.PedidoModel;
import com.example.relacionamentoEntreTabelas.service.PedidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/pedidos")
public class PedidoController {

    @Autowired
    private PedidosService pedidosService;

    @PostMapping
    public ResponseEntity<PedidoModel> cadastrarPedido(@RequestBody PedidoModel pedidoModel) {
        PedidoModel pedidos = pedidosService.cadastrarNovosPedidos(pedidoModel);
        return new ResponseEntity<>(pedidos, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<PedidoModel>> exibirPedidos() {
        return ResponseEntity.ok(pedidosService.exibirPedidosCadastrados());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<PedidoModel>> exibirViaId(@PathVariable Long id) {
        return ResponseEntity.ok(pedidosService.exibirPedidosViaId(id));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<PedidoModel> alterarPedidosCadastrado(@RequestBody PedidoModel pedidoModel) {
        return ResponseEntity.ok(pedidosService.alterarPedidoCadastrado(pedidoModel));

    }

    @DeleteMapping(path = "/{id}")
    public void deletarPedidosCadastrados(@PathVariable Long id) {
        pedidosService.deletar(id);
    }

    //Query
    @GetMapping(path = "/find-all")
    public ResponseEntity<List<PedidoModel>> getPedidos() {
        return ResponseEntity.ok(pedidosService.getPedidos());
    }

}
