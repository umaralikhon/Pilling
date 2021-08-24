package com.pilling.service;

import com.pilling.entity.Pills;

import java.util.List;

public interface PillsService {
    List<Pills> getAllPills();

    Pills savePill(Pills pill);

    Pills searchPills(String name);

    Pills getPill(int id);

    void deletePill(int id);
}
