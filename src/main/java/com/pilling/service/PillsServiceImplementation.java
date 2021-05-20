package com.pilling.service;

import com.pilling.dao.PillsDAO;
import com.pilling.entity.Pills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PillsServiceImplementation implements PillsService{
    @Autowired
    private PillsDAO pillsDAO;

    @Override
    @Transactional
    public List<Pills> getAllPills(){
        return pillsDAO.getAllPills();
    }

    @Override
    @Transactional
    public void savePill(Pills pill){
        pillsDAO.savePill(pill);
    }

    @Override
    @Transactional
    public List<Pills> searchPills(String name){
        return pillsDAO.searchPills(name);
    }
}
