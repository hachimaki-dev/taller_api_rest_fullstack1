package com.profecarlos.tallerapirest.restapi.model;

public class View {

    private int id;
    private int id_video;
    private int cantidad_views;

    public View(int id, int id_video, int cantidad_views) {
        this.id = id;
        this.id_video = id_video;
        this.cantidad_views = cantidad_views;
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

    public int getCantidad_views() {
        return cantidad_views;
    }

    public void setCantidad_views(int cantidad_views) {
        this.cantidad_views = cantidad_views;
    }

}
