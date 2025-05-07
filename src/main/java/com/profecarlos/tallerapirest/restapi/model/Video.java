package com.profecarlos.tallerapirest.restapi.model;

public class Video {

    private int id;
    private String video;
    private String category;
    private String fileOrigin;

    public Video(int id, String video, String category, String fileOrigin) {
        this.id = id;
        this.video = video;
        this.category = category;
        this.fileOrigin = fileOrigin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFileOrigin() {
        return fileOrigin;
    }

    public void setFileOrigin(String fileOrigin) {
        this.fileOrigin = fileOrigin;
    }
    
    
}
