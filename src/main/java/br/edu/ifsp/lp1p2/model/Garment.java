package br.edu.ifsp.lp1p2.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "garments")
@Data
public class Garment {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "basePrice")
    private Double basePrice;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "garment")
    private List<OrderItem> orderItems;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "modelId", nullable = false)
    private Model model;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "garment")
    private List<Measure> measures;

}
