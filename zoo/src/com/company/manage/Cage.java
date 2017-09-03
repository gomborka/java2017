package com.company.manage;

import com.company.animal.Animal;

import java.util.Arrays;

/**
 * Created by borka on 9/2/2017.
 */
public class Cage {

Animal[] airCage;
Animal [] wildCage;
Animal [] waterCage;

    public Animal[] getAirCage() {
        return airCage;
    }

    public void setAirCage(Animal[] airCage) {
        this.airCage = airCage;
    }

    public Animal[] getWildCage() {
        return wildCage;
    }

    public void setWildCage(Animal[] wildCage) {
        this.wildCage = wildCage;
    }

    public Animal[] getWaterCage() {
        return waterCage;
    }

    public void setWaterCage(Animal[] waterCage) {
        this.waterCage = waterCage;

    }

    public addAnimalToCage (nimal )
    @Override
    public String toString() {
        return "Cage{" +
                "airCage=" + Arrays.toString(airCage) +
                ", wildCage=" + Arrays.toString(wildCage) +
                ", waterCage=" + Arrays.toString(waterCage) +
                '}';
    }
}
