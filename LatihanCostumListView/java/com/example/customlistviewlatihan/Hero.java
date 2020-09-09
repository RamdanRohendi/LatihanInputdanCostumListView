package com.example.customlistviewlatihan;

public class Hero {
    int image;
    String name;
    String team;

    public Hero(int image, String name, String team){
        this.image = image;
        this.name = name;
        this.team = team;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }
}
