package com.profecarlos.tallerapirest.restapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profecarlos.tallerapirest.restapi.model.CompararPrecios;
import com.profecarlos.tallerapirest.restapi.model.Product;
import com.profecarlos.tallerapirest.restapi.repository.CompararPreciosRepository;

@RestController
@RequestMapping("api/v1")
public class CompararPreciosController {

    @Autowired
    private CompararPreciosRepository CompararPreciosRepository; 


    @PostMapping("CompararPreciosPost")
    public ResponseEntity<CompararPrecios> insertarDatos(@RequestBody CompararPrecios compararPrecios){
       CompararPrecios guardarDatos = CompararPreciosRepository.save(compararPrecios);
       return new ResponseEntity<>(guardarDatos, HttpStatus.CREATED);
    }


    @GetMapping("/compararPreciosGet")
    public ResponseEntity<List<CompararPrecios>> compararPreciosGet(){
       List<CompararPrecios> resultado = CompararPreciosRepository.findAll();
        return new ResponseEntity<>(resultado, HttpStatus.OK);
    
    }
    
    @PutMapping("/compararPrecio/{id}")
    public ResponseEntity<CompararPrecios> updateCompararPrecio(@PathVariable int id, @RequestBody
    CompararPrecios datos) {
    Optional<CompararPrecios> existe = CompararPreciosRepository.findById(id);
        if (existe.isPresent()) {
            CompararPrecios updateCompararPrecios= CompararPreciosRepository.save(datos);
            return new ResponseEntity<>(updateCompararPrecios, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
