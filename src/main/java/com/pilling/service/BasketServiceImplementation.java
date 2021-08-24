package com.pilling.service;

import com.pilling.repository.BasketRepository;
import com.pilling.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BasketServiceImplementation implements BasketService {
    @Autowired
    private BasketRepository repository;

    @Override
    public List<Basket> getAllPills() {
        List<Basket> allPills = repository.findAll();
        return allPills;
    }

    @Override
    public Basket getPill(int id) {
        Optional<Basket> optional = repository.findById(id);
        Basket basket =null;

        if(optional.isEmpty()) {
            System.out.println("Nothing found!");
            return null;
        }

        basket = optional.get();
        return basket;
    }

    @Override
    public void savePill(Basket pill) {
        repository.save(pill);
    }

    @Override
    public void truncateTable() {
        repository.deleteAll();
    }
}
