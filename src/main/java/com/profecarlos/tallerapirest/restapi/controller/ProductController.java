package com.profecarlos.tallerapirest.restapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profecarlos.tallerapirest.restapi.model.Product;


@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @PostMapping("product")
    public Product insertProduct(@RequestBody Product producto) {
        
        
        return producto;
    }
    

  



}
