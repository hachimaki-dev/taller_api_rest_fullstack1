package com.profecarlos.tallerapirest.restapi.model;

public class Product {
    private long id;
    private String nombre;
    private double precio;

    public Product(long id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    public long getId() {
        return id;
    }
    

    public void setId(long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    

    }