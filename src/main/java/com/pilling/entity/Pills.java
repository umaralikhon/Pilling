package com.pilling.entity;

/**
 * @Author Umaralikhon Kayumov
 */

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "pills")
@Data
@NoArgsConstructor
public class Pills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "name")
    private String name;

    @Column(name = "cost")
    private int cost;

    @Column(name = "amount")
    private int amount;
}
