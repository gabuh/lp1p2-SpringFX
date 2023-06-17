package br.edu.ifsp.lp1p2.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "budgets")
@Data
public class Budget extends Order{
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    @Column(name = "creationDate", nullable = false)
    private Date creationDate;
    @Column(name = "total", nullable = false)
    private BigDecimal total;
    @Column(name = "comments", nullable = false)
    private String comments;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "budget")
    private List<OrderItem> orderItems;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "orderId", nullable = false)
    private Order order;

}
