package com.example.relacionamentoEntreTabelas.repository;

import com.example.relacionamentoEntreTabelas.model.PedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPedidosRepository extends JpaRepository<PedidoModel, Long> {
}
