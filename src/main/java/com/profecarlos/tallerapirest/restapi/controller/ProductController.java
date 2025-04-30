package com.profecarlos.tallerapirest.restapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.profecarlos.tallerapirest.restapi.model.Product;

@RestController
public class ProductController {
    @PostMapping("/productos")
    public String crearProducto(@RequestBody Product producto) {
        return "Producto creado: " + producto.getNombre() + " - $" + producto.getPrecio();
    }
}
