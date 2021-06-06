package com.pilling.dao;

import com.pilling.entity.*;

import java.util.List;

public interface BasketDAO {
    List<Basket> getAllPills();

    Basket getPill(int id);

    void savePill(Basket pill);

    void truncateTable();
}
