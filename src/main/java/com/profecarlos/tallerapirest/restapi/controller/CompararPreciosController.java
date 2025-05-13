package com.profecarlos.tallerapirest.restapi.controller;

import com.profecarlos.tallerapirest.restapi.repository.CompararPreciosRepository;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/v1")
public class CompararPreciosController {

    @Autowired
    private CompararPreciosRepository compararPreciosRepository;

    @PostMapping("ComprarPreciosPost")
    public ResponseEntity<CompararPrecios>insertarDatos> insertarDatos(@RequestBody CompararPrecios compararPrecios){
        CompararPrecios guardarDatos = compararPreciosRepository.save(compararPrecios);
        return new ResponseEntity<>(guardarDatos, HttpStatus.CREATED);
    }
    
}
