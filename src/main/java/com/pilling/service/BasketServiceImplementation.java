package com.pilling.service;

import com.pilling.dao.BasketDAO;
import com.pilling.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BasketServiceImplementation implements BasketService {
    @Autowired
    private BasketDAO basketDAO;

    @Override
    @Transactional
    public List<Basket> getAllPills() {
        return basketDAO.getAllPills();
    }

    @Override
    @Transactional
    public Basket getPill(int id) {
        return basketDAO.getPill(id);
    }

    @Override
    @Transactional
    public void savePill(Basket pill) {
        basketDAO.savePill(pill);
    }

    @Override
    @Transactional
    public void truncateTable() {
        basketDAO.truncateTable();
    }
}
