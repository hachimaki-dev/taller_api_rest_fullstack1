package com.profecarlos.tallerapirest.restapi.model;

public class Like {
    
    private int id;
    private int id_video;
    private int quantity_likes;

    public Like(int id, int id_video, int quantity_likes) {
        this.id = id;
        this.id_video = id_video;
        this.quantity_likes = quantity_likes;
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

    public int getCantity() {
        return quantity_likes;
    }

    public void setCantity(int quantity_likes) {
        this.quantity_likes = quantity_likes;
    }

    
}
