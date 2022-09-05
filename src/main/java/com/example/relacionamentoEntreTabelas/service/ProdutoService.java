package com.example.relacionamentoEntreTabelas.service;

import com.example.relacionamentoEntreTabelas.model.ProdutoModel;
import com.example.relacionamentoEntreTabelas.repository.IProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProdutoService {


    @Autowired
    IProdutoRepository iProdutoRepository;

    public ProdutoModel cadastrarProdutos(ProdutoModel produtoModel) {
        return iProdutoRepository.save(produtoModel);
    }

    public List<ProdutoModel> exibirProdutosCadastrados() {
        return iProdutoRepository.findAll();
    }

    public Optional<ProdutoModel> exibirViaId(Long id) {
        return iProdutoRepository.findById(id);
    }

    public ProdutoModel alterarProdutosCadastrados(ProdutoModel produtoModel) {
        return iProdutoRepository.save(produtoModel);
    }

    public void deletarProdutos(Long id) {
        iProdutoRepository.deleteById(id);
    }
}
