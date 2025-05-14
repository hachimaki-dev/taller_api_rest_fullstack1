package com.profecarlos.tallerapirest.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profecarlos.tallerapirest.restapi.model.CompararPrecios;
import com.profecarlos.tallerapirest.restapi.repository.CompararPreciosRepository;

@RestController
@RequestMapping("api/v1")
public class CompararPreciosController {

    @Autowired
    private CompararPreciosRepository juanito;

    @PostMapping("CompararPreciosPost")
    public ResponseEntity<CompararPrecios> insertarDatos(@RequestBody CompararPrecios compararPrecios){
        CompararPrecios guardarDatos = juanito.save(compararPrecios);
        return new ResponseEntity<>(guardarDatos, HttpStatus.CREATED);
    }
    
}
