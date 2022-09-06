package com.example.relacionamentoEntreTabelas.service;

import com.example.relacionamentoEntreTabelas.model.PedidoModel;
import com.example.relacionamentoEntreTabelas.repository.IPedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidosService {


    @Autowired
    private IPedidosRepository iPedidosRepository;

    public PedidoModel cadastrarNovosPedidos(PedidoModel pedidoModel) {
        return iPedidosRepository.save(pedidoModel);
    }

    public List<PedidoModel> exibirPedidosCadastrados() {
        return iPedidosRepository.findAll();
    }

    public Optional<PedidoModel> exibirPedidosViaId(Long id) {
        return iPedidosRepository.findById(id);
    }

    public PedidoModel alterarPedidoCadastrado(PedidoModel pedidoModel) {
        return iPedidosRepository.save(pedidoModel);
    }

    public void deletar(Long id) {
        iPedidosRepository.deleteById(id);
    }

    //Query
    public List<PedidoModel> getPedidos() {
        return iPedidosRepository.getPedidos();
    }
}
