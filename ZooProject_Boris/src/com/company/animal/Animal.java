package com.company.animal;

/**
 * Created by borka on 9/2/2017.
 */
public class Animal {

    private String name;
    private String place;

    public Animal(String name, String place) {
        this.name = name;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                '}';
    }
}
