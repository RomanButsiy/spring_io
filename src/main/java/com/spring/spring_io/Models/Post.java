package com.spring.spring_io.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title, anons, full_text, img;
    private int views;
    private Timestamp cts, mts;

    public Post(String title, String anons, String full_text, String img) {
        this.title = title;
        this.anons = anons;
        this.full_text = full_text;
        this.img = img;
    }

    public Post() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnons() {
        return anons;
    }

    public void setAnons(String anons) {
        this.anons = anons;
    }

    public String getFull_text() {
        return full_text;
    }

    public void setFull_text(String full_text) {
        this.full_text = full_text;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public Timestamp getCts() {
        return cts;
    }

    public void setCts(Timestamp cts) {
        this.cts = cts;
    }

    public Timestamp getMts() {
        return mts;
    }

    public void setMts(Timestamp mts) {
        this.mts = mts;
    }
}
