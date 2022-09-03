package com.example.relacionamentoEntreTabelas.repository;

import com.example.relacionamentoEntreTabelas.model.EstadoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstadoRepository extends JpaRepository<EstadoModel, Long> {
}
