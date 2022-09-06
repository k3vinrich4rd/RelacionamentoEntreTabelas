package com.example.relacionamentoEntreTabelas.service;

import com.example.relacionamentoEntreTabelas.model.ClienteModel;
import com.example.relacionamentoEntreTabelas.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private IClienteRepository iClienteRepository;

    public ClienteModel cadastrarCliente(ClienteModel clienteModel) {
        return iClienteRepository.save(clienteModel);
    }

    public List<ClienteModel> exibirTodosClientes() {
        return iClienteRepository.findAll();
    }

    public Optional<ClienteModel> exibirClientesViaId(Long id) {
        return iClienteRepository.findById(id);
    }

    public ClienteModel alterarCadastrado(ClienteModel clienteModel) {
        return iClienteRepository.save(clienteModel);
    }

    public void deletarCadastro(Long id) {
        iClienteRepository.deleteById(id);
    }

    public List<ClienteModel> getBuscaCliente() {
        return iClienteRepository.getCliente();
    }
}
