package com.pilling.dao;

import com.pilling.entity.Pills;

import java.util.List;

public interface PillsDAO {
    List<Pills> getAllPills();
    void savePill(Pills pill);
//    Pills getPill(int id);
}