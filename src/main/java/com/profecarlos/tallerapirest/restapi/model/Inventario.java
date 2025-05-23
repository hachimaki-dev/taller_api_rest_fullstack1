package com.profecarlos.tallerapirest.restapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class Inventario {

    private int idInventario;           
    private int idProducto;             
    private String nombreSucursal;      
    private String nombreProducto;      
    private int cantidadProducto;       
    private int stockMinimo;            
    private int stockMaximo;            

    
    public Inventario(int idInventario, int idProducto, String nombreSucursal, String nombreProducto,
            int cantidadProducto, int stockMinimo, int stockMaximo) {
        this.idInventario = idInventario;
        this.idProducto = idProducto;
        this.nombreSucursal = nombreSucursal;
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.stockMinimo = stockMinimo;
        this.stockMaximo = stockMaximo;

    }


    public int getIdInventario() {
        return idInventario;
    }


    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }


    public int getIdProducto() {
        return idProducto;
    }


    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }


    public String getNombreSucursal() {
        return nombreSucursal;
    }


    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }


    public String getNombreProducto() {
        return nombreProducto;
    }


    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }


    public int getCantidadProducto() {
        return cantidadProducto;
    }


    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }


    public int getStockMinimo() {
        return stockMinimo;
    }


    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }


    public int getStockMaximo() {
        return stockMaximo;
    }


    public void setStockMaximo(int stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    


}


