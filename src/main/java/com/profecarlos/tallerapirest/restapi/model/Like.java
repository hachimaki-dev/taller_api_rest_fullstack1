package com.profecarlos.tallerapirest.restapi.model;

public class Like {
    
    private int id;
    private int id_video;
    private int cantidad_likes;
    
    public Like(int id, int id_video, int cantidad_likes) {
        this.id = id;
        this.id_video = id_video;
        this.cantidad_likes = cantidad_likes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_video() {
        return id_video;
    }

    public void setId_video(int id_video) {
        this.id_video = id_video;
    }

    public int getcantidad_likes() {
        return cantidad_likes;
    }

    public void setcantidad_likes(int cantidad_likes) {
        this.cantidad_likes = cantidad_likes;
    }


    
}
