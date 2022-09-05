package com.example.relacionamentoEntreTabelas.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "estados")
public class EstadoModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_estado", length = 50, nullable = false)
    private String nomeEstado;

    @Column(name = "sigla_estado", length = 2, nullable = false)
    private String siglaEstado;

    @JsonIgnore // Para evitar erros de recursividade
    //Mapped tem que ser igual o nome da minha classe
    //Cascade = cascata            //TypeAll - excluir tudo
    //Um estado para uma cidade
    @OneToMany(mappedBy = "estadoModel", cascade = CascadeType.ALL)
    private List<CidadeModel> cidadeModel = new ArrayList<>();
}
