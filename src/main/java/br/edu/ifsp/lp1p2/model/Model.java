package br.edu.ifsp.lp1p2.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "models")
@Data
public class Model {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "multiplier", nullable = false)
    private Double multiplier;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "model")
    private List<OrderItem> orderItems;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "model")
    private List<Garment> garments;
}
