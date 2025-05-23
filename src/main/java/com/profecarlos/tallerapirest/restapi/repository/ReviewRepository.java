package com.profecarlos.tallerapirest.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.profecarlos.tallerapirest.restapi.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer>{
    
    List<Review> findByIdJuego(String idJuego);
}
