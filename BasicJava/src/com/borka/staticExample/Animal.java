package com.borka.staticExample;

/**
 * Created by Comp14 on 03/09/2017.
 */
public class Animal {
   // static String name ="liri";
   String name;
   static   int id=0;
   int number;

    public Animal (String name)
    {
        this.name =name;
        this.number=id++;
      //  this.number=number;
    }

    public String getName() {
        return name;
    }

    public static int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }
}
