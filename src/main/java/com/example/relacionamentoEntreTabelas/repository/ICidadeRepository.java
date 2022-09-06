package com.example.relacionamentoEntreTabelas.repository;

import com.example.relacionamentoEntreTabelas.model.CidadeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICidadeRepository extends JpaRepository<CidadeModel, Long> {
    @Query("select c from CidadeModel c")
    public List<CidadeModel> getCidades();
}
