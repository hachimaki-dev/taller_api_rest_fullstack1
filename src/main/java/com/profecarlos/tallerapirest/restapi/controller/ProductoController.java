package com.profecarlos.tallerapirest.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductoController {
    //Ej 1
    @GetMapping("/api/productos")
    public String Productos(){
        return "Se listan los productos";
    }
    //Ej 2
    @GetMapping("/api/productos/{id}")
    public String Productos(@PathVariable int id){
        return "Se lista el producto n°"+(id);
    }
    //Ej 3
    @GetMapping("/api/productos/filtrar")
    public String Productos(
        @RequestParam(required = false) String categoria,
        @RequestParam(defaultValue = "0") int precioMin,
        @RequestParam(defaultValue = "10000") int precioMax){
        return "Datos del producto: \nCategoria: " + (categoria)+"\nPrecioMin: "+(precioMin)+"\nPrecioMax: "+(precioMax);
    }

    //Ej 4
    @GetMapping("/api/productos/buscar")
    public String Productos(
        @RequestParam String termino,
        @RequestParam(defaultValue = "nombre") String ordenarPor,
        @RequestParam(defaultValue = "asc") String orden,
        @RequestParam(defaultValue = "10") int limite
    ){
        //Si ordenarPor no esta en la lista retornar error
        if (ordenarPor.equals("nombre") || ordenarPor.equals("precio") || ordenarPor.equals("popularidad")) {
            return "Termino: "+ termino + "\nOrdenarPor: "+ ordenarPor + "\nOrden: "+ orden +"\nLimite: "+limite;
        } else {
            return "Esta categoria no existe";
        }
        
    }
}
