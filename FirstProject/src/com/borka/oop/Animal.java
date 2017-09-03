package com.borka.oop;

/**
 * Created by Comp14 on 31/08/2017.
 */
public class Animal implements Creature {
    private String name ="Animal";
    private  int age;
    private boolean canFly;

public Animal (int age,boolean canFly)
{

    this.age=age;
    this.canFly =canFly;
}



public String getName()
{
    return name;
}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
