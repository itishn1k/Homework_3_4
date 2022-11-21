package com.example.homework_3_4;

import java.io.Serializable;

public class Continent implements Serializable {

    String continent;
    private final String shape;

    public Continent(String continent, String shape) {
        this.continent = continent;
        this.shape = shape;
    }

    public String getContinent() {
        return continent;
    }

    public String getShape() {
        return shape;
    }
}