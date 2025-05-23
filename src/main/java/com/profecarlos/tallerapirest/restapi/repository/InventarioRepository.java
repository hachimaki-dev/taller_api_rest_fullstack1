package com.profecarlos.tallerapirest.restapi.repository;

import com.profecarlos.tallerapirest.restapi.model.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioRepository extends JpaRepository<Inventario, Integer> {
}