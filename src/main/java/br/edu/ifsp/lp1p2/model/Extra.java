package br.edu.ifsp.lp1p2.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "extras")
@Data
public class Extra {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "multiplier")
    private Double multiplier;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "orderItemId", nullable = false)
    private OrderItem orderItem;
}
