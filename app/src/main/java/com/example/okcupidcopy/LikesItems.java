package com.example.okcupidcopy;
public class LikesItems {
    private int image;
    private String name;
    private String city;

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public LikesItems(int image, String name, String city) {
        this.image = image;
        this.name = name;
        this.city = city;
    }
}