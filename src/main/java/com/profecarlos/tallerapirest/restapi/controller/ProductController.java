package com.profecarlos.tallerapirest.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    
    @GetMapping("/api/productos")
    public String listar(){
        return "listando todos los productos";
    }

    @GetMapping("/api/productos/{id}")
    public String listartodo(@PathVariable long id){
        return "listando el productos" + id;
    }



}
