package com.profecarlos.tallerapirest.restapi.controller;
 
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
 @RestController
 public class ProductoController {
     
     @GetMapping("path")
     public String Saludo(){
         return "Hola como estas";
     }
     
     @GetMapping("usuario/{id}")
     public String getUsuario(@PathVariable Long id) {
         return "Hola usuario: " + id;
     }
    
     @GetMapping("/api/productos")
     public String ListarProductos(){
         return "Se están listando todos los productos";
     }
     @GetMapping("api/productos/{id}")
     public String getProducto(@PathVariable Long id) {
         return "Se esta mostrando el producto de id: " + id;
     }
     @GetMapping("/api/productos/filtrar")
     public String filtrarProductos(
        @RequestParam(required = false) String categoria, @RequestParam(defaultValue = "0") int precioMin, @RequestParam (defaultValue = "10000") int precioMax){
        return ("Lista de productos filtrados por categoría, precioMin y precioMax: " + categoria + "," + precioMin + "," + precioMax
        );
     }
     @GetMapping("/api/productos/buscar")
     public String busqueda

 }