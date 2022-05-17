package com.instagram.post.instagrampost.Model;

import javax.persistence.*;

@Entity
@Table(name="Post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String Title;
    private String body;
    private int likes;
    private int poster;

    public Post() {
    }


    public Post(int id, String title, String body, int likes, int poster) {
        this.id = id;
        Title = title;
        this.body = body;
        this.likes = likes;
        this.poster = poster;
    }

    public Post(int id, String title, String body) {
        this.id = id;
        Title = title;
        this.body = body;

    }

    public Post(int id, String title, String body, int likes) {
        this.id = id;
        Title = title;
        this.body = body;
        this.likes = likes;
    }


    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
