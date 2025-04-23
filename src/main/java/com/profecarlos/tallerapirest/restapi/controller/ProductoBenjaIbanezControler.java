package com.profecarlos.tallerapirest.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoBenjaIbanezControler {
    
    @GetMapping("/saludar")
    public String saludar(){
        return "Hola como estás?";
    }

    @GetMapping("/usuario/{id}")
    public String getUsuario(@PathVariable Long id){
        return "Hola usuario tu id es: " + id;
    }
}
