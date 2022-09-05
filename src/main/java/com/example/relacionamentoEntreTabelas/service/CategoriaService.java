package com.example.relacionamentoEntreTabelas.service;

import com.example.relacionamentoEntreTabelas.model.CategoriaModel;
import com.example.relacionamentoEntreTabelas.repository.ICategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {


    @Autowired
    private ICategoriaRepository iCategoriaRepository;

    public CategoriaModel cadastrarCategoria(CategoriaModel categoriaModel) {
        return iCategoriaRepository.save(categoriaModel);
    }

    public List<CategoriaModel> exibirCategoria() {
        return iCategoriaRepository.findAll();
    }

    public Optional<CategoriaModel> exibirViaId(Long id) {
        return iCategoriaRepository.findById(id);
    }


    public CategoriaModel atualizarCategoria(CategoriaModel categoriaModel) {
        return iCategoriaRepository.save(categoriaModel);
    }

    public void deletarCategoria(Long id) {
        iCategoriaRepository.deleteById(id);
    }
}
