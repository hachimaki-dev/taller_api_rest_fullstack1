package com.profecarlos.tallerapirest.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.profecarlos.tallerapirest.restapi.model.Venta;

public interface VentaRepository extends JpaRepository<Venta, Integer> {
    List<Venta> findByCategoria(int id);
}
