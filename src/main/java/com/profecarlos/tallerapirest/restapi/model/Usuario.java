package com.profecarlos.tallerapirest.restapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// creo la tabla llamada usuario
@Entity
@Table(name = "Usuario")
public class Usuario {

    // id autoincremental
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // columna nombre
    @Column(nullable = false)
    private String nombre;

    // columna email
    @Column(nullable = false)
    private String email;

    // columna password
    @Column(nullable = false)
    private String password;

    // parametros
    public Usuario(int id, String nombre, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    // constructor vacio  por jpa
    public Usuario() {
    }

    // get y set
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}