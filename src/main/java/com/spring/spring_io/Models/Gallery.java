package com.spring.spring_io.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Gallery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title, text, img;
    private int views;
    private Date cts, mts;

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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    public Date getCts() {
        return cts;
    }

    public void setCts(Date cts) {
        this.cts = cts;
    }

    public Date getMts() {
        return mts;
    }

    public void setMts(Date mts) {
        this.mts = mts;
    }
}
