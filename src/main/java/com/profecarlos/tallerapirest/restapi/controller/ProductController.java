package com.profecarlos.tallerapirest.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @GetMapping("/products")
    public String getproducst(){
        return "se listan todos los productos";


    }
    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable long id){

        return "haz obtenido el producto con el id"+id;

    }
}
