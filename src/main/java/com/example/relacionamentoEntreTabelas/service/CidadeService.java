package com.example.relacionamentoEntreTabelas.service;

import com.example.relacionamentoEntreTabelas.model.CidadeModel;
import com.example.relacionamentoEntreTabelas.repository.ICidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadeService {

    @Autowired
    private ICidadeRepository iCidadeRepository;

    public CidadeModel cadastrarNovasCidades(CidadeModel cidadeModel) {
        return iCidadeRepository.save(cidadeModel);
    }

    public List<CidadeModel> exibirCidades() {
        return iCidadeRepository.findAll();
    }


    public Optional<CidadeModel> exibirCidadesViaId(Long id) {
        return iCidadeRepository.findById(id);
    }

    public CidadeModel alterarEstados(CidadeModel cidadeModel) {
        return iCidadeRepository.save(cidadeModel);
    }

    public void apagarEstadoCadastrado(Long id) {
        iCidadeRepository.deleteById(id);
    }

    //Query
    public List<CidadeModel> getCidades() {
        return iCidadeRepository.getCidades();
    }


}
