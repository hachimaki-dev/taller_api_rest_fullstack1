package com.profecarlos.tallerapirest.restapi.repository;


import com.profecarlos.tallerapirest.restapi.model.Product;
import com.profecarlos.tallerapirest.restapi.model.compararPrecios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface compararPreciosRepository  extends JpaRepository<compararPrecios, Integer>{
    
}