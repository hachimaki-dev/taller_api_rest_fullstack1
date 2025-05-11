package com.profecarlos.tallerapirest.restapi.dto;

public class CancionDTO {
    private String nombre;
    private String genero;
    private int album;
    private String artista;

    // Getters y setters
    public String getNombre() { 
        return nombre; 
    }
    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero; 
    }
    public int getAlbum() {
        return album;
    }
    public void setAlbum(int album) {
        this.album = album;
    }
    public String getArtista() {
        return artista; 
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
}
