package com.company;

import com.company.animal.*;
import com.company.manage.Zoo;

public class Main {

    public static void main(String[] args) {

    Zoo zoo = new Zoo();

        Animal zebra =new Zebra("zebra", "ground");
        Animal shark =new Shark("shark", "water");
        Animal bird = new Bird ("bird","air");

       zoo.addAnimalToCage(zebra);
//        zoo.addAnimalToCage(zebra);
//        zoo.addAnimalToCage(zebra);

    }
}
