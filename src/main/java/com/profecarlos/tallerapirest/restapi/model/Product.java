package com.profecarlos.tallerapirest.restapi.model;

import jakarta.validation.constraints.NotBlank;

public class Product {

    private String nombre;
    @NotBlank(message = "El precio no puede estar vacio")

    private double precio;

    public Product(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
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
