package br.edu.ifsp.lp1p2.model;

import br.edu.ifsp.lp1p2.enums.Color;
import br.edu.ifsp.lp1p2.enums.Size;
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
    @Enumerated(EnumType.STRING)
    private Size size;

    @Column(name = "color")
    @Enumerated(EnumType.STRING)
    private Color color;

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
