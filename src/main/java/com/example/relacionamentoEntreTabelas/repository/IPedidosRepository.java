package com.example.relacionamentoEntreTabelas.repository;

import com.example.relacionamentoEntreTabelas.model.PedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPedidosRepository extends JpaRepository<PedidoModel, Long> {
    @Query("select p from PedidoModel p ")
    List<PedidoModel> getPedidos();

}
