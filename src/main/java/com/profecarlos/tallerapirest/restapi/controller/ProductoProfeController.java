package com.profecarlos.tallerapirest.restapi.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class ProductoProfeController {

    @GetMapping("/saludar")
    public String saludo(){
        return "Hola cómo estas?";
    }

    @GetMapping("/usuario/{id}")
    public String getUsuario(@PathVariable Long id){
        return "Hola usuario tu id es " + id;
    }
    
}
