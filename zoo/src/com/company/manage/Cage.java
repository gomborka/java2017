package com.company.manage;

import com.company.animal.Animal;

import java.util.Arrays;



public class Cage {

    private String nameCage;

    private Animal[] animals;


    public Cage(String nameCage) {
        this.nameCage = nameCage;
    }

    public void addTo (Animal animal, Cage cage )
  {

      airCage[0] =animal;

  }


    @Override
    public String toString() {
        return "Cage{" +
                "airCage=" + Arrays.toString(airCage) +
                ", wildCage=" + Arrays.toString(wildCage) +
                ", waterCage=" + Arrays.toString(waterCage) +
                '}';
    }
}
