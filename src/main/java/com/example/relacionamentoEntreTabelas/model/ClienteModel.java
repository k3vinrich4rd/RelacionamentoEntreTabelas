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
@Table(name = "clientes")
public class ClienteModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_cliente", length = 50, nullable = false)
    private String nomeCliente;

    //Cascade = cascata// type = tipo = // All = tudo
    //Cascade e para se excluir cliente o endereço seja excluído
    //OneToMany, vários endereços um cliente
    @JsonIgnore // Para evitar recursividade de busca //Ignora o atributo mapeado

    @OneToMany(mappedBy = "clienteModel", cascade = CascadeType.ALL) //mappedBy, tem que ser o mesmo nome do objeto
    //Sempre que acabar com many, fazer uma lista
    private List<EnderecoModel> enderecoModel = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "clienteModel", cascade = CascadeType.ALL)
    private List<PedidoModel> pedidoModel = new ArrayList<>();


}
