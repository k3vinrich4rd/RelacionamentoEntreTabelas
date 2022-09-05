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
@Table(name = "produtos")
public class ProdutoModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_produto", length = 50, nullable = false)
    private String nomeProduto;

    @Column(name = "descricao_produto", length = 150, nullable = false)
    private String descricaoProduto;

    @Column(name = "preco_produto", length = 200, nullable = false)
    private BigDecimal preco;

    @Column(name = "data_cadastro")
    private LocalDate dataCadastro = LocalDate.now();

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaModel categoriaModel;

    @JsonIgnore
    @OneToMany(mappedBy = "produtoModel", cascade = CascadeType.ALL)
    private List<ItemPedidoModel> itemPedidoModel = new ArrayList<>();


}
