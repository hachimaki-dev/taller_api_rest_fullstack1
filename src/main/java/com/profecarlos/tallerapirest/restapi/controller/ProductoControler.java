package com.profecarlos.tallerapirest.restapi.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productos")
public class ProductoControler {

    // Ejercicio 1
    @GetMapping()
    public String ListarProductos(){
        return "Listando productos";
    }

    // Ejercicio 2
    @GetMapping("/{id}")
    public String ObtenerProductoID(@PathVariable int id){
        return "Obteniendo producto de ID " + id;
    }

    //Ejercicio 3
    @GetMapping("/filtrar")
    public String  filtrarCategorias(@RequestParam(required = false) String categoria,
                                     @RequestParam(defaultValue = "0") int precioMin,
                                     @RequestParam(defaultValue = "10000") int precioMax){

        if(categoria != null){
            return "Filtrando productos por categoria " + categoria;
        }

        return "Filtrando productos con precio entre " + precioMin + " y " + precioMax;

    }

    //Ejercicio 4
    @GetMapping("/buscar")
    public String buscarCategorias(@RequestParam(required = true) String termino,
                                   @RequestParam(defaultValue = "nombre") String ordenarPo,
                                   @RequestParam  String a){

        return null;
    }

}
