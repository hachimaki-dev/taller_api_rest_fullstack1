package com.profecarlos.tallerapirest.restapi.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "album")
public class Album {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String artista;

    @Column(nullable = false)
    private String fechaLanzamiento;

    @OneToMany(mappedBy = "album")
    @JsonIgnore
    private List<Cancion> canciones;

    
    //Constructors
    public Album(int id, String nombre, String artista, String fechaLanzamiento, List<Cancion> canciones) {
        this.id = id;
        this.nombre = nombre;
        this.artista = artista;
        this.fechaLanzamiento = fechaLanzamiento;
        this.canciones = canciones;
    }
    
    public Album() {
    }

    public int getId() {
        return id;
    }
    
    //Getters & Setters
    
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

}
