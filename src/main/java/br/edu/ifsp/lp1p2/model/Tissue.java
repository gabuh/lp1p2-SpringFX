package br.edu.ifsp.lp1p2.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "tissues")
@Data
public class Tissue {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "tissue")
    private List<OrderItem> orderItems;

}
