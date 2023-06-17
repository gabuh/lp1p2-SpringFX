package br.edu.ifsp.lp1p2.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clients")
@Data
public class Client {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;

    @Column(name = "name")
    private String nome;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "client")
    private List<Budget> budgets;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "client")
    private List<Measure> measures;
}
