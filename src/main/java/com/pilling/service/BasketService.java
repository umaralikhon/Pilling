package com.pilling.service;

import com.pilling.entity.*;

import java.util.List;

public interface BasketService {
    List<Basket> getAllPills();

    Basket getPill(int id);

    void savePill(Basket pill);

    void truncateTable();
}
