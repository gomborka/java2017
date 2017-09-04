package com.company;

import com.company.animal.*;
import com.company.zooManage.Cage;
import com.company.zooManage.Zoo;

public class Main {

    public static void main(String[] args) {

    Zoo zoo = new Zoo();

        Animal zebra =new Zebra("zebra", "ground");
        Animal lion =new Zebra("lion", "ground");
        Animal shark =new Shark("shark", "water");
        Animal dolphin = new Dolphin ("dolphin","water");
        Animal bird = new Bird ("bird","air");
        Animal eagle= new Eagle ("eagle","air");



        zoo.addAnimalToZoo(zebra);
         zoo.addAnimalToZoo(lion);
        zoo.addAnimalToZoo(dolphin);
        zoo.addAnimalToZoo(shark);
        zoo.addAnimalToZoo(eagle);
        zoo.addAnimalToZoo(bird);


        System.out.println(" ----  All animal in the ZOO :  -----------");
        zoo.printCage(Cage.groundCage);
        zoo.printCage(Cage.airCage);
        zoo.printCage(Cage.waterCage);


    }
}
