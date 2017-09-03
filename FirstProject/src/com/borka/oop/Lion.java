package com.borka.oop;

/**
 * Created by Comp14 on 31/08/2017.
 */
public class Lion extends Animal {

    private String name ="lion";

    public Lion( int age, boolean canFly) {
        super(age, canFly);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
