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

import com.profecarlos.tallerapirest.restapi.model.Review;
import com.profecarlos.tallerapirest.restapi.repository.ReviewRepository;

@RestController
@RequestMapping("/api/v1")
public class ReviewController {
    
    // Inyección del repositorio
    @Autowired
    private ReviewRepository reviewRepository;

    @PostMapping("review")
    public ResponseEntity<Review> insertProduct(@RequestBody Review review) {
        Review savedProduct = reviewRepository.save(review);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

    @GetMapping("reviews") // Devuelve todos los reviews
    public ResponseEntity<List<Review>> getAllProducts() {
        List<Review> reviews = reviewRepository.findAll();
        return new ResponseEntity<>(reviews, HttpStatus.OK);
    }

    // Métodos adicionales para completar el CRUD
    @GetMapping("review/{id}") // Devuelve un producto por su id
    public ResponseEntity<Review> getProductById(@PathVariable("id") int id) {
        return reviewRepository.findById(id)
                .map(review -> new ResponseEntity<>(review, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("reviews/juego/{idJuego}") // Devuelve todas las reviews de un juego
    public ResponseEntity<List<Review>> getReviewByCategoria(@PathVariable String idJuego) {
        List<Review> reviews = reviewRepository.findByIdJuego(idJuego);
        return new ResponseEntity<>(reviews, HttpStatus.OK);
    }

    @PutMapping("review/{id}") // Actualiza un producto
    public ResponseEntity<Review> updateReview(@PathVariable("id") int id, @RequestBody Review reviewActualizado) {
        return reviewRepository.findById(id)
                .map(reviewExistente -> {
                    reviewExistente.setidJuego(reviewActualizado.getIdJuego());
                    reviewExistente.setComentario(reviewActualizado.getComentario());
                    Review updated = reviewRepository.save(reviewExistente);
                    return new ResponseEntity<>(updated, HttpStatus.OK);
                })
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("review/{id}")
    public ResponseEntity<Void> deleteReview(@PathVariable("id") int id) {
        return reviewRepository.findById(id)
                .map(review -> {
                    reviewRepository.delete(review);
                    return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
                })
                .orElse(new ResponseEntity<Void>(HttpStatus.NOT_FOUND));
    }
}
// Este controlador es el encargado de manejar las peticiones HTTP relacionadas con los reviews
