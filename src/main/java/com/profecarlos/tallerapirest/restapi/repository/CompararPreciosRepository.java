package com.profecarlos.tallerapirest.repository;

import com.profecarlos.tallerapirest.restapi.model.CompararPrecios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompararPreciosRepository extends JpaRepository<CompararPrecios, Integer> {
    
}
