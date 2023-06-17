package br.edu.ifsp.lp1p2.model;

import br.edu.ifsp.lp1p2.enums.PaymentType;
import br.edu.ifsp.lp1p2.enums.Status;
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
    private Long id;

    @Column(name = "deliveryDate", nullable = false)
    private Date deliveryDate;
    @Column(name = "paid", nullable = false)
    private Byte paid;
    @Column(name = "payDay", nullable = false)
    private Date payDay;
    @Column(name = "paymentType", nullable = false)
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;
    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToOne(mappedBy = "order")
    private Budget budget;

}
