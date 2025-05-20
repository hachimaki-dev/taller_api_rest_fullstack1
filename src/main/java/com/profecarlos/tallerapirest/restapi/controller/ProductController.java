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

import com.profecarlos.tallerapirest.restapi.model.Product;
import com.profecarlos.tallerapirest.restapi.repository.ProductRepository;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    // Inyección del repositorio
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("product")
    public ResponseEntity<Product> insertProduct(@RequestBody Product producto) {
        Product savedProduct = productRepository.save(producto);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

    @GetMapping("products")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    // Métodos adicionales para completar el CRUD
    @GetMapping("product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") int id) {
        return productRepository.findById(id)
                .map(product -> new ResponseEntity<>(product, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("products/categoria/{categoria}")
    public ResponseEntity<List<Product>> getProductsByCategoria(@PathVariable String categoria) {
        List<Product> products = productRepository.findByCategoria(categoria);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PutMapping("product/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable("id") int id, @RequestBody Product productoActualizado) {
        return productRepository.findById(id)
                .map(productoExistente -> {
                    productoExistente.setNombre(productoActualizado.getNombre());
                    productoExistente.setCategoria(productoActualizado.getCategoria());
                    productoExistente.setPrecio(productoActualizado.getPrecio());
                    productoExistente.setDescripcion(productoActualizado.getDescripcion());
                    Product updated = productRepository.save(productoExistente);
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
