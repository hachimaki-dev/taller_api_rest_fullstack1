package com.profecarlos.tallerapirest.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {
    
    @GetMapping("/api/productos")
    public String Productos(){
        return "Se listan los productos";
    }

    @GetMapping("/api/productos/{id}")
    public String Productos(@PathVariable int id){
        return "Se lista el producto n°"+(id);
    }

    /*@GetMapping("/api/productos/")
    public String Productos(@PathVariable int id){
        return "Se lista el producto n°"+(id);
    }*/
}
