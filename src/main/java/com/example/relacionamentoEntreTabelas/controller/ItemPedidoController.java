package com.example.relacionamentoEntreTabelas.controller;

import com.example.relacionamentoEntreTabelas.model.ItemPedidoModel;
import com.example.relacionamentoEntreTabelas.service.ItemPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/itemsPedidos")
public class ItemPedidoController {

    @Autowired
    private ItemPedidoService itemPedidoService;

    @PostMapping
    public ResponseEntity<ItemPedidoModel> cadastrarPedido(@RequestBody ItemPedidoModel itemPedidoModel) {
        ItemPedidoModel itemPedido = itemPedidoService.cadastrarPedido(itemPedidoModel);
        return new ResponseEntity<>(itemPedido, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ItemPedidoModel>> exibirPedidos() {
        return ResponseEntity.ok(itemPedidoService.exibirPedidos());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<ItemPedidoModel>> exibirPedidoViaId(@PathVariable Long id) {
        return ResponseEntity.ok(itemPedidoService.exibirPedidoViaId(id));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<ItemPedidoModel> alterarPedido(@RequestBody ItemPedidoModel itemPedidoModel) {
        return ResponseEntity.ok(itemPedidoService.atualizarPedido(itemPedidoModel));
    }

    @DeleteMapping(path = "/{id}")
    public void deletarPedido(@PathVariable Long id) {
        itemPedidoService.deletarPedido(id);
    }

    //Query
    @GetMapping(path = "/find-all")
    public ResponseEntity<List<ItemPedidoModel>> getItemPedidos() {
        return ResponseEntity.ok(itemPedidoService.getPedidos());
    }
}
