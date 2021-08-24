package com.pilling.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "basket")
@Data
@NoArgsConstructor
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "cost")
    private int cost;

    @Column(name = "name")
    private String name;

    @Column(name = "sum")
    private int sum;
}
