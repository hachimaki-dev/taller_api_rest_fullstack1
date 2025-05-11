package com.profecarlos.tallerapirest.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profecarlos.tallerapirest.restapi.model.Product;
import com.profecarlos.tallerapirest.restapi.repository.ProductRepository;



@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;
    //Esto sirve para guardar el producto en la base de datos
    @PostMapping("product")
    public ResponseEntity<Product> insertProduct(@RequestBody Product producto) {
        Product savedProduct = productRepository.save(producto);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

                                                                                        

}
