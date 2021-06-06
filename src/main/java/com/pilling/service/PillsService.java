package com.pilling.service;

import com.pilling.entity.Pills;

import java.util.List;

public interface PillsService {
    List<Pills> getAllPills();

    void savePill(Pills pill);

    List<Pills> searchPills(String name);

    Pills getPill(int id);

    void deletePill(int id);
}
