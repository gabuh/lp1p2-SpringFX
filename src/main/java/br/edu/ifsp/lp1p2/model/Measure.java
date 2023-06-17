package br.edu.ifsp.lp1p2.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "measures")
@Data
public class Measure {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "size")
    private Double size;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "garmentId", nullable = false)
    private Garment garment;

}
