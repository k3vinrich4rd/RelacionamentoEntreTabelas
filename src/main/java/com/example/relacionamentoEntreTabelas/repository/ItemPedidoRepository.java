package com.example.relacionamentoEntreTabelas.repository;

import com.example.relacionamentoEntreTabelas.model.ItemPedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedidoModel, Long> {
}
