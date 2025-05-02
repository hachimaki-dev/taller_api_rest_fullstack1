package com.profecarlos.tallerapirest.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.profecarlos.tallerapirest.restapi.model.Product;

@RestController
public class ProductController {
    
    @GetMapping("/api/productos")
    public String listarProductos(){
        return "Se están listando todos los productos de la tienda";
    }


    @GetMapping("/api/productos/{id}")
    public String producto(@PathVariable Long id){
        return "Se esta mostrando el producto con id: " + id;
    }

    @GetMapping("/api/productos/filtrar")
    public String productoFiltrar(
        @RequestParam(required = false) String categoria,
        @RequestParam(defaultValue = "0") int precioMin,
        @RequestParam(defaultValue = "10000") int precioMax){
        return "Se está mostrando producto con filtros: " + categoria + ", " + precioMin + " y " + precioMax;
    }

    @GetMapping("/api/productos/buscar")
    public String producto(
        @RequestParam(required = true) String termino,
        @RequestParam(defaultValue = "nombre") String ordenarPor,
        @RequestParam(defaultValue = "asc") String orden,
        @RequestParam(defaultValue = "10") int limite){
        return "Se están mostrando productos del tipo: " + termino + " ordenado por " + ordenarPor + " de manera " + orden + " y límite " + limite;
    }

    @PostMapping("product")
    public Product insertProduct(@RequestBody Product producto){
        return producto;
    }
}