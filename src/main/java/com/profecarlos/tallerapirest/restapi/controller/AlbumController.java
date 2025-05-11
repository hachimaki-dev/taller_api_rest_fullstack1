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
import com.profecarlos.tallerapirest.restapi.repository.AlbumRepository;

@RestController
@RequestMapping("/api/v1")
public class AlbumController {
    
    @Autowired
    private AlbumRepository albumRepository;
    @PostMapping("album")
    public ResponseEntity<Album> insertAlbum(@RequestBody Album album) {
        Album savedAlbum = albumRepository.save(album);
        return new ResponseEntity<>(savedAlbum, HttpStatus.CREATED);
    }

    @GetMapping("album/{id}")
    public ResponseEntity<Album> getAlbumById(@PathVariable Integer id) {
        return albumRepository.findById(id)
                .map(album -> new ResponseEntity<>(album, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("album")
    public ResponseEntity<Iterable<Album>> getAllAlbums() {
        Iterable<Album> albums = albumRepository.findAll();
        return new ResponseEntity<>(albums, HttpStatus.OK);
    }
}
