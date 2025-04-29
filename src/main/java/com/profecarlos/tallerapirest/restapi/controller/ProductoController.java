package com.profecarlos.tallerapirest.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.profecarlos.tallerapirest.restapi.models.Producto;


@RestController
public class ProductoController {

    @GetMapping("/api/productos")
    public String listarProductos(){
        return "Se han listado los productos";
    }

    @GetMapping("/api/productos/{id}")
    public Producto getProduct(@PathVariable Long id) {
        return new Producto(id,"producto",30000);
    }
    
    @GetMapping("api/productos/filtrar")
    public String filtarProducto(String categoria,float precioMin, float precioMax){
        return "Categoria: " + categoria + "Precio Mínimo" + precioMin + "Precio Máximo" + precioMax;
    }
    
}
