package com.profecarlos.tallerapirest.restapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profecarlos.tallerapirest.restapi.model.Product;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @PostMapping("product")
    public Product insertProduct(){
        Product producto = new Product(1,"Tarjeta de video", "la mejor", 200.00, "componentes");
        return producto;
    }
    
}
