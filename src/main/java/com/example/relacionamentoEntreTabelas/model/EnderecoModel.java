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
@Table(name = "enderecos")
public class EnderecoModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "logradouro_endereco", length = 50, nullable = false)
    private String logradouro;

    @ManyToOne // Muitos para um / //Vários endereços um cliente
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private ClienteModel clienteModel;

}
