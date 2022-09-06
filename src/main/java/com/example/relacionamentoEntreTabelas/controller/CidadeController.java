package com.example.relacionamentoEntreTabelas.controller;

import com.example.relacionamentoEntreTabelas.model.CidadeModel;
import com.example.relacionamentoEntreTabelas.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/cidades")
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @PostMapping
    public ResponseEntity<CidadeModel> cadastrarNovosEstados(@RequestBody CidadeModel cidadeModel) {
        CidadeModel cidades = cidadeService.cadastrarNovasCidades(cidadeModel);
        return new ResponseEntity<>(cidades, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<CidadeModel>> exibirTodasAsCidades() {
        return ResponseEntity.ok(cidadeService.exibirCidades());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<CidadeModel>> exibirCidadesViaId(@PathVariable Long id) {
        return ResponseEntity.ok(cidadeService.exibirCidadesViaId(id));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<CidadeModel> alterarEstadosCadastrados(@RequestBody CidadeModel cidadeModel) {
        return ResponseEntity.ok(cidadeService.alterarEstados(cidadeModel));
    }

    @DeleteMapping(path = "/{id}")
    public void apagarEstados(@PathVariable Long id) {
        cidadeService.apagarEstadoCadastrado(id);
    }

    //Query
    @GetMapping(path = "/find-all")
    public ResponseEntity<List<CidadeModel>> getCidades() {
        return ResponseEntity.ok(cidadeService.getCidades());
    }


}
