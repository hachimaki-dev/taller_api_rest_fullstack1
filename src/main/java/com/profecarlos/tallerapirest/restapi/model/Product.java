package com.profecarlos.tallerapirest.restapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Le especifica a java que esta clase se va a tratar como una tabla de una base de datos
@Entity
@Table(name = "products")

public class Product {
    //Le especifica a java que este atributo es la clave primaria de la tabla
    @Id
    //Le especifica a java que este atributo es autoincremental
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //Le especifica a java que este atributo es una columna que no recibe null
    @Column(nullable = false)
    private String nombre;

    //Le especifica a java que este atributo es una columna que no recibe null
    @Column
    private String categoria;

    @Column(nullable = false)
    private double precio;

    @Column(length = 10000)
    private String descripcion;

    //Constructors
    public Product(int id, String nombre, String descripcion, double precio, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
    }

    public Product() {
    }

    //Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
