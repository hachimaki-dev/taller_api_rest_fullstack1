package com.profecarlos.tallerapirest.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/api/productos/filtrar")
    public String filtrar(
        @RequestParam(required=false) String categoria,
        @RequestParam(defaultValue="0") double valorMin,
        @RequestParam(defaultValue="10000") double valorMax){
            return "Filtrando productos: " +
            (categoria != null ? " de la categoría: " + categoria : "") +
            ", con precios entre$" + valorMin + "y $" + valorMax;
        }
    
    @GetMapping("/api/productos/buscar")
    public String buscar(
        @RequestParam(required=false) String termino,
        @RequestParam(defaultValue="nombre") String ordenarPor,
        @RequestParam(defaultValue="asc") String order,
        @RequestParam(defaultValue="10") int max){
            return "Busqueda de producto por termino: \"" + termino + "\"" +
            ", ordenados por " + ordenarPor +
            "("+ order +")" +
            ", mostrando hasta " + max + " resultados.";

        }



}
