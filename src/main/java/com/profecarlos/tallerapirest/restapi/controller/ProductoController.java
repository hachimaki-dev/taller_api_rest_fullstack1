package com.profecarlos.tallerapirest.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

@GetMapping
public String listaProducto(){
    return "Se listan todos los productos";
}
    
@GetMapping("/{id}")
public String getProducto(@PathVariable long id){
    return"se esta mostrando los detalles del producto con su id" +id;
}
    
@GetMapping("/filtrar")
public String FiltrarProductos(
    @RequestParam (required = false) String categoria,
    @RequestParam (defaultValue ="0") double minPrecio, 
    @RequestParam (defaultValue ="10000") double maxPrecio) {
    return "Mostrar productos con: " +
           "categoria = " + (categoria != null ? categoria : "todo del producto") +
           "precio minimo producto = " + minPrecio + 
           "precio maximo producto = " + maxPrecio;
}

@GetMapping("/buscar")
public String buscarProductos(
        @RequestParam String termino,
        @RequestParam(defaultValue = "nombre") String ordenarPor,
        @RequestParam(defaultValue = "asc") String orden,
        @RequestParam(defaultValue = "10") int limite
) {
    return String.format("Buscando: %s, Ordenar por: %s (%s), Límite: %d",
            termino, ordenarPor, orden, limite);
}

}
