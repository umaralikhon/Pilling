package com.pilling.entity;

import javax.persistence.*;

@Entity
@Table(name = "basket")
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

    public Basket() {

    }

    public Basket(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }
}
