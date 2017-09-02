package com.company;

import com.company.animal.Bird;
import com.company.animal.Lion;
import com.company.animal.Shark;
import com.company.animal.Zebra;
import com.company.manage.Zoo;

public class Main {

    public static void main(String[] args) {

    Zoo zoo = new Zoo();

        Zebra zebra =new Zebra("zebra", "ground");
        Shark shark =new Shark("shark", "water");
        Bird bird = new Bird ("bird","air");

        zoo.addAnimalToCage(zebra);
        zoo.addAnimalToCage(zebra);
        zoo.addAnimalToCage(zebra);

    }
}
