package com.profecarlos.tallerapirest.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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
        return new Producto(id,"producto",5000);
    }
    
    @GetMapping("/api/productos/filtrar")
    public String filtarProducto(@RequestParam(required=false) String categoria,
                                 @RequestParam (defaultValue="0") Double precioMin,
                                 @RequestParam (defaultValue="10000") Double precioMax){
        return "Usted eligio: " + categoria + ", El precio máximo es de: " + precioMax + " y el precio minimo es de: " + precioMin;
    }

    @GetMapping("/api/productos/buscar")
    public String buscarProducto (@RequestParam String termino){
        return "";
    }
    
}
