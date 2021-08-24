package com.pilling.repository;

import com.pilling.entity.Pills;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PillingRepository extends JpaRepository<Pills, Integer> {
    Optional<Pills> findByName(String name);
}
