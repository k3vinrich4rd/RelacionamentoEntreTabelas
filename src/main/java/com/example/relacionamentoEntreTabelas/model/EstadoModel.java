package com.example.relacionamentoEntreTabelas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
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

    @ManyToOne // Muitos para um / //Várias cidades para um estado
    @JoinColumn(name = "cidade_id", referencedColumnName = "id")
    private CidadeModel cidadeModel;
}
