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
@Table(name = "cidades")
public class CidadeModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_cidade", length = 50, nullable = false)
    private String nomeCidade;
    //Cascade = cascata// type = tipo = // All = tudo
    //Cascade e para se excluir cliente o endereço seja excluído
    //OneToMany, várias cidades para um estado

    @ManyToOne
    @JoinColumn(name = "estados_id",referencedColumnName = "id")
    private EstadoModel estadoModel;


}
