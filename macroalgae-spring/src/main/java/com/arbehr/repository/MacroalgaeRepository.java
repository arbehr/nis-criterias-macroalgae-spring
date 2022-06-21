package com.arbehr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arbehr.model.Macroalgae;

@Repository
public interface MacroalgaeRepository extends JpaRepository<Macroalgae, Integer> {
    
}
