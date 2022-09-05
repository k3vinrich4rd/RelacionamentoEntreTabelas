package com.example.relacionamentoEntreTabelas.service;

import com.example.relacionamentoEntreTabelas.model.ItemPedidoModel;
import com.example.relacionamentoEntreTabelas.repository.ItemPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemPedidoService {


    @Autowired
    private ItemPedidoRepository itemPedidoRepository;

    public ItemPedidoModel cadastrarPedido(ItemPedidoModel itemPedidoModel) {
        return itemPedidoRepository.save(itemPedidoModel);
    }

    public List<ItemPedidoModel> exibirPedidos() {
        return itemPedidoRepository.findAll();
    }

    public Optional<ItemPedidoModel> exibirPedidoViaId(Long id) {
        return itemPedidoRepository.findById(id);
    }

    public ItemPedidoModel atualizarPedido(ItemPedidoModel itemPedidoModel) {
        return itemPedidoRepository.save(itemPedidoModel);
    }

    public void deletarPedido(Long id) {
        itemPedidoRepository.deleteById(id);
    }
}
