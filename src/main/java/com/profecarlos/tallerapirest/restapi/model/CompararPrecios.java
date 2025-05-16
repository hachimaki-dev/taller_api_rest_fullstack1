package com.profecarlos.tallerapirest.restapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CompararPrecios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable= false)
    private String nombre_producto;

    @Column(nullable= false)
    private String marca_producto;

    @Column(nullable= false)
    private int cantidad_unidad_medida;

    @Column(nullable= false)
    private String unidad_medida_producto;

    @Column(nullable= false)
    private float precio_producto;

    @Column(nullable= false)
    private String nombre_supermercado;

    public CompararPrecios(){
        
    }

    public CompararPrecios(int id, String nombre_producto, String marca_producto, int cantidad_unidad_medida,
            String unidad_medida_producto, float precio_producto, String nombre_supermercado) {
        this.id = id;
        this.nombre_producto = nombre_producto;
        this.marca_producto = marca_producto;
        this.cantidad_unidad_medida = cantidad_unidad_medida;
        this.unidad_medida_producto = unidad_medida_producto;
        this.precio_producto = precio_producto;
        this.nombre_supermercado = nombre_supermercado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getMarca_producto() {
        return marca_producto;
    }

    public void setMarca_producto(String marca_producto) {
        this.marca_producto = marca_producto;
    }

    public int getCantidad_unidad_medida() {
        return cantidad_unidad_medida;
    }

    public void setCantidad_unidad_medida(int cantidad_unidad_medida) {
        this.cantidad_unidad_medida = cantidad_unidad_medida;
    }

    public String getUnidad_medida_producto() {
        return unidad_medida_producto;
    }

    public void setUnidad_medida_producto(String unidad_medida_producto) {
        this.unidad_medida_producto = unidad_medida_producto;
    }

    public float getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(float precio_producto) {
        this.precio_producto = precio_producto;
    }

    public String getNombre_supermercado() {
        return nombre_supermercado;
    }

    public void setNombre_supermercado(String nombre_supermercado) {
        this.nombre_supermercado = nombre_supermercado;
    }

    

    
}
