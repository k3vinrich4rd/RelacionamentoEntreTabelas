package com.example.relacionamentoEntreTabelas.repository;

import com.example.relacionamentoEntreTabelas.model.CidadeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICidadeRepository extends JpaRepository<CidadeModel, Long> {
}
