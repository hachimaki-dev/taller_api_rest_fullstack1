package com.profecarlos.tallerapirest.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profecarlos.tallerapirest.restapi.model.Juego;
import com.profecarlos.tallerapirest.restapi.repository.JuegoRepository;

@RestController
@RequestMapping("/api/v1")
public class CatalogoController {
    // Inyección del repositorio
    @Autowired
    private JuegoRepository juegoRepository;

    @GetMapping("juegos")
    public ResponseEntity<List<Juego>> getAllProducts() {
        List<Juego> products = juegoRepository.findAll();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    // Métodos adicionales para completar el CRUD
    @GetMapping("juegos/{id}")
    public ResponseEntity<Juego> getProductById(@PathVariable("id") int id) {
        return juegoRepository.findById(id)
                .map(product -> new ResponseEntity<>(product, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("juegos/categoria/{categoria}")
    public ResponseEntity<List<Juego>> getProductsByCategoria(@PathVariable String categoria) {
        List<Juego> products = juegoRepository.findByCategoria(categoria);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

}
