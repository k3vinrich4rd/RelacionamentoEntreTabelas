package com.example.relacionamentoEntreTabelas.controller;

import com.example.relacionamentoEntreTabelas.model.ProdutoModel;
import com.example.relacionamentoEntreTabelas.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<ProdutoModel> cadastrarPedido(@RequestBody ProdutoModel produtoModel) {
        ProdutoModel produtos = produtoService.cadastrarProdutos(produtoModel);
        return new ResponseEntity<>(produtos, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ProdutoModel>> exibirProdutosCadastrados() {
        return ResponseEntity.ok(produtoService.exibirProdutosCadastrados());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<ProdutoModel>> exibirViaId(@PathVariable Long id) {
        return ResponseEntity.ok(produtoService.exibirViaId(id));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<ProdutoModel> alterarProdutos(@RequestBody ProdutoModel produtoModel) {
        return ResponseEntity.ok(produtoService.alterarProdutosCadastrados(produtoModel));
    }

    @DeleteMapping(path = "/{id}")
    public void deletarProdutos(@PathVariable Long id) {
        produtoService.deletarProdutos(id);
    }

    //Query
    @GetMapping(path = "/find-all")
    public ResponseEntity<List<ProdutoModel>> getProdutos() {
        return ResponseEntity.ok(produtoService.getProdutos());
    }
}
