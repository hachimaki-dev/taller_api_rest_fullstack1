package com.profecarlos.tallerapirest.restapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String idJuego;

    @Column(length =  1000)
    private String comentario;

    public Review() {
    }

    public Review(int id, String idJuego, String comentario) {
        this.id = id;
        this.idJuego = idJuego;
        this.comentario = comentario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdJuego() {
        return idJuego;
    }

    public void setidJuego(String idJuego) {
        this.idJuego = idJuego;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

}
