package com.profecarlos.tallerapirest.restapi.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoDiegoController {

    @GetMapping("/saludar")
    public String saludo()  {
        return "Hola como estas?";
    }
   @GetMapping("/usuarios/{id}")
    public String usuario(@PathVariable String id)  {
        return "Hola usuario tu id es " + id;	
    }
    @GetMapping("/productos/{id}")
    public String producto()  {
        return "Hola producto";
    }
    @GetMapping("/productos")
    public String productos()  {
        return "Hola productos";
    }
}
