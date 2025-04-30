
package com.profecarlos.tallerapirest.restapi.ProductoController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    
    @GetMapping
    public String listarProductos() {
        return "Se estan listando todos los productos";
    }

  
    @GetMapping("/{id}")
    public String obtenerProductoPorId(@PathVariable Long id) {
        return "Se esta mostrando el producto con ID: " + id;
    }


@GetMapping("/filtrar")
    public String filtrarProductos(
            @RequestParam(required = false) String categoria,
            @RequestParam(defaultValue = "0") Double precioMin,
            @RequestParam(defaultValue = "1000") Double precioMax) {
        
        return "Filtrando productos por categoria: " + categoria + ", precio minimo: " + precioMin + ", precio maximo: " + precioMax;
    }
     
}



  
  




