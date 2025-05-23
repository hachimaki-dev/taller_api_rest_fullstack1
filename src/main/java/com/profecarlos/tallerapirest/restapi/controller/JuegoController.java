package com.profecarlos.tallerapirest.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profecarlos.tallerapirest.restapi.model.Juego;
import com.profecarlos.tallerapirest.restapi.repository.JuegoRepository;

@RestController
@RequestMapping("/api/v1")
public class JuegoController {
    // Inyección del repositorio
    @Autowired
    private JuegoRepository productRepository;

    @PostMapping("product")
    public ResponseEntity<Juego> insertProduct(@RequestBody Juego producto) {
        Juego savedProduct = productRepository.save(producto);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

    @GetMapping("products")
    public ResponseEntity<List<Juego>> getAllProducts() {
        List<Juego> products = productRepository.findAll();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    // Métodos adicionales para completar el CRUD
    @GetMapping("product/{id}")
    public ResponseEntity<Juego> getProductById(@PathVariable("id") int id) {
        return productRepository.findById(id)
                .map(product -> new ResponseEntity<>(product, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("products/categoria/{categoria}")
    public ResponseEntity<List<Juego>> getProductsByCategoria(@PathVariable String categoria) {
        List<Juego> products = productRepository.findByCategoria(categoria);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PutMapping("product/{id}")
    public ResponseEntity<Juego> updateProduct(@PathVariable("id") int id, @RequestBody Juego productoActualizado) {
        return productRepository.findById(id)
                .map(productoExistente -> {
                    productoExistente.setNombre(productoActualizado.getNombre());
                    productoExistente.setCategoria(productoActualizado.getCategoria());
                    productoExistente.setPrecio(productoActualizado.getPrecio());
                    productoExistente.setDescripcion(productoActualizado.getDescripcion());
                    Juego updated = productRepository.save(productoExistente);
                    return new ResponseEntity<>(updated, HttpStatus.OK);
                })
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("product/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable("id") int id) {
        return productRepository.findById(id)
                .map(producto -> {
                    productRepository.delete(producto);
                    return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
                })
                .orElse(new ResponseEntity<Void>(HttpStatus.NOT_FOUND));
    }
}
