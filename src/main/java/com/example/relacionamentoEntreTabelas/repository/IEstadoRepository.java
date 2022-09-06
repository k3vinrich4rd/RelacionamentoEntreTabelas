package com.example.relacionamentoEntreTabelas.repository;

import com.example.relacionamentoEntreTabelas.model.EstadoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEstadoRepository extends JpaRepository<EstadoModel, Long> {
    @Query("select e from EstadoModel e")
    public List<EstadoModel> getEstados();
}
