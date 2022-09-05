package com.example.relacionamentoEntreTabelas.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pedidos")
public class PedidoModel implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "valor_total", length = 200, nullable = false)
    private BigDecimal valorTotal;

    @Column(name = "data_pedido")
    private LocalDate datePedido = LocalDate.now();

    @ManyToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private ClienteModel clienteModel;

    @JsonIgnore
    @OneToMany(mappedBy = "pedidoModel", cascade = CascadeType.ALL)
    private List<ItemPedidoModel> itemPedidoModel = new ArrayList<>();
}
