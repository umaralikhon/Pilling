package com.pilling.entity;

/**
 * @Author Umaralikhon Kayumov
 */

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "pills")
public class Pills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "name")
    @NotEmpty(message = "Field should not be empty!")
    @NotBlank(message = "Field should not bu filled with blanks only!")
    private String name;

    @Column(name = "cost")
    @NotEmpty(message = "Field should not be empty!")
    @NotBlank(message = "Field should not bu filled with blanks only!")
    private int cost;

    @Column(name = "amount")
    @NotEmpty(message = "Field should not be empty!")
    @NotBlank(message = "Field should not bu filled with blanks only!")
    private int amount;

    public Pills() {

    }

    public Pills(String name, int cost, int amount) {
        this.name = name;
        this.cost = cost;
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return this.cost;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
