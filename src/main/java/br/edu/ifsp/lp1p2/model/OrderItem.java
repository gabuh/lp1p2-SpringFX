package br.edu.ifsp.lp1p2.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "orderitems")
@Data
public class OrderItem {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(name = "size")
    private String size;

    @Column(name = "color")
    private String color;

    @Column(name = "itemValue")
    private BigDecimal valorItem;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "orderItem")
    private List<Extra> extras;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tissueId", nullable = false)
    private Tissue tissue;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "budgetId", nullable = false)
    private Budget budget;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "modelId", nullable = false)
    private Model model;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "garmentId", nullable = false)
    private Garment garment;

}
