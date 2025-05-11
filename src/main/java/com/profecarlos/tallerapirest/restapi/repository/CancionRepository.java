package com.profecarlos.tallerapirest.restapi.repository;
import com.profecarlos.tallerapirest.restapi.model.Cancion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CancionRepository extends JpaRepository<Cancion, Integer>{

}