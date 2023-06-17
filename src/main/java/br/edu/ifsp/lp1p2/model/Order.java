package br.edu.ifsp.lp1p2.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
public class Order {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;

    @Column(name = "deliveryDate", nullable = false)
    private Date deliveryDate;
    @Column(name = "paid", nullable = false)
    private Byte paid;
    @Column(name = "payDay", nullable = false)
    private Date payDay;
    @Column(name = "paymentType", nullable = false)
    private String paymentType;
    @Column(name = "status", nullable = false)
    private String status;

    @OneToOne(mappedBy = "order")
    private Budget budget;

}
