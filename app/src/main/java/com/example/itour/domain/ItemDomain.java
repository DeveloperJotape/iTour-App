package com.example.itour.domain;

import java.io.Serializable;

public class ItemDomain implements Serializable {

    private String title;
    private String address;
    private String description;
    private String picture;
    private Double score;
    private Double price;

    public ItemDomain() {
    }

    public ItemDomain(String title, String address, String description, String picture, Double score, Double price) {
        this.title = title;
        this.address = address;
        this.description = description;
        this.picture = picture;
        this.score = score;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
