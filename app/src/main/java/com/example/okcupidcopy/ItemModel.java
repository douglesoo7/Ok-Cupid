package com.example.okcupidcopy;

public class ItemModel {
    private int image;
    private String name;
    private int age;
    private String place;
    private String percentage;
    private String description;
    public ItemModel(int image, String name, int age, String place, String percentage, String description) {
        this.image = image;
        this.name = name;
        this.age = age;
        this.place = place;
        this.percentage = percentage;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPlace() {
        return place;
    }

    public String getPercentage() {
        return percentage;
    }

    public String getDescription() {
        return description;
    }
}
