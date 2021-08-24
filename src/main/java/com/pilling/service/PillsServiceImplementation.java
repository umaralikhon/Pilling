package com.pilling.service;

import com.pilling.repository.PillingRepository;
import com.pilling.entity.Pills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PillsServiceImplementation implements PillsService {
    @Autowired
    private PillingRepository repository;

    @Override
    public List<Pills> getAllPills() {
        return repository.findAll();
    }

    @Override
    public Pills savePill(Pills pill) {
        return repository.save(pill);
//        return pill;
    }

    @Override
    public Pills searchPills(String name) {
        Pills pill = null;
        Optional<Pills> optional = repository.findByName(name);

        if(optional.isPresent()){
            pill = optional.get();
        }
        return pill;
    }

    @Override
    public Pills getPill(int id) {
        Pills pill = null;
        Optional<Pills> optional = repository.findById(id);

        if (optional.isPresent()) {
            pill = optional.get();
        }

        return pill;
    }

    @Override
    public void deletePill(int id) {
        repository.deleteById(id);
    }
}