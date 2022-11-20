package com.example.homework_3_4;

import java.io.Serializable;

public class Continent implements Serializable {

    String continent;
    private String countryName;
    private String shape;

    public String getCountryName() {
        return countryName;
    }

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