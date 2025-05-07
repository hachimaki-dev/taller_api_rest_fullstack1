package com.profecarlos.tallerapirest.restapi.model;

public class Video {
    
    private int id;
    private String name;
    private String category;
    private String fileOrigin;

    public Video(int id, String name, String category, String fileOrigin) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.fileOrigin = fileOrigin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
