package com.example.relacionamentoEntreTabelas.service;

import com.example.relacionamentoEntreTabelas.model.EnderecoModel;
import com.example.relacionamentoEntreTabelas.repository.IEnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    IEnderecoRepository iEnderecoRepository;

    public EnderecoModel cadastrarEndereco(EnderecoModel enderecoModel) {
        return iEnderecoRepository.save(enderecoModel);
    }

    public List<EnderecoModel> exibirTodosEnderecos() {
        return iEnderecoRepository.findAll();
    }

    public Optional<EnderecoModel> exibirViaId(Long id) {
        return iEnderecoRepository.findById(id);
    }

    public EnderecoModel alterarEnderecos(EnderecoModel enderecoModel) {
        return iEnderecoRepository.save(enderecoModel);
    }

    public void deletarEndereco(Long id) {
        iEnderecoRepository.deleteById(id);
    }

}

