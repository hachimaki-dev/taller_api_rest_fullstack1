package com.profecarlos.tallerapirest.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profecarlos.tallerapirest.restapi.model.Album;
import com.profecarlos.tallerapirest.restapi.model.Cancion;
import com.profecarlos.tallerapirest.restapi.repository.AlbumRepository;
import com.profecarlos.tallerapirest.restapi.repository.CancionRepository;
import com.profecarlos.tallerapirest.restapi.dto.CancionDTO;

@RestController
@RequestMapping("/api/v1")
public class CancionController {
    
    @Autowired
    private CancionRepository cancionRepository;

    @Autowired
    private AlbumRepository albumRepository;

    @PostMapping("Cancion")
    public ResponseEntity<?> insertCancion(@RequestBody CancionDTO cancionDTO) {
        Album album = albumRepository.findById(cancionDTO.getAlbum()).orElse(null);
        if (album == null) {
            return new ResponseEntity<>("Album no encontrado", HttpStatus.NOT_FOUND);
        }

        Cancion newCancion = new Cancion();
        newCancion.setNombre(cancionDTO.getNombre());
        newCancion.setGenero(cancionDTO.getGenero());
        newCancion.setAlbum(album);
        newCancion.setArtista(cancionDTO.getArtista());

        Cancion savedCancion = cancionRepository.save(newCancion);
        return new ResponseEntity<>(savedCancion, HttpStatus.CREATED);
    }


    @GetMapping("Cancion/{id}")
    public ResponseEntity<?> getCancionById(@PathVariable Integer id) {
        Cancion cancion = cancionRepository.findById(id).orElse(null);
        if (cancion == null) {
            return new ResponseEntity<>("Canción no encontrada", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(cancion, HttpStatus.OK);
    }

    @GetMapping("Cancion")
    public ResponseEntity<?> getAllCanciones() {
        Iterable<Cancion> canciones = cancionRepository.findAll();
        return new ResponseEntity<>(canciones, HttpStatus.OK);
    }
}
