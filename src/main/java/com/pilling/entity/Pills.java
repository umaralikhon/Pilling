package com.pilling.entity;

import javax.persistence.*;

@Entity
@Table(name = "pills")
public class Pills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "name")
    private String name;

    @Column(name = "cost")
    private int cost;

    @Column(name="amount")
    private int amount;

    public Pills() {

    }

    public Pills(String name, int cost) {
        this.name = name;
        this.cost = cost;
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

    public void setAmount(int amount){
        this.amount = amount;
    }

    public int getAmount(){
        return this.amount;
    }

    public void setId(int id){
        this.id= id;
    }

    public int getId(){
        return id;
    }
}
