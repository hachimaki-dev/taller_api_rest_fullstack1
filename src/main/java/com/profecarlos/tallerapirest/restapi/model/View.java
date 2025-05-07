package com.profecarlos.tallerapirest.restapi.model;

public class View {
    
    private int id;
    private int id_video;
    private int quantity_views;
    
    public View(int id, int id_video, int quantity_views) {
        this.id = id;
        this.id_video = id_video;
        this.quantity_views = quantity_views;
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

    public int getQuantity_views() {
        return quantity_views;
    }

    public void setQuantity_views(int quantity_views) {
        this.quantity_views = quantity_views;
    }

    
}
