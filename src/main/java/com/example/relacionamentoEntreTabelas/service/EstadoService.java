package com.example.relacionamentoEntreTabelas.service;

import com.example.relacionamentoEntreTabelas.model.EstadoModel;
import com.example.relacionamentoEntreTabelas.repository.IEstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {


    @Autowired
    private IEstadoRepository iEstadoRepository;

    public EstadoModel cadastrarEstado(EstadoModel estadoModel) {
        return iEstadoRepository.save(estadoModel);
    }

    public List<EstadoModel> exibirEstadosCadastrados() {
        return iEstadoRepository.findAll();
    }

    public Optional<EstadoModel> exibirEstadosViaId(Long id) {
        return iEstadoRepository.findById(id);
    }

    public EstadoModel alterarEstados(EstadoModel estadoModel) {
        return iEstadoRepository.save(estadoModel);
    }

    public void deletarEstado(Long id) {
        iEstadoRepository.deleteById(id);
    }
}
