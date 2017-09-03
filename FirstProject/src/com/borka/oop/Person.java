package com.borka.oop;

/**
 * Created by Comp14 on 31/08/2017.
 */
public class Person implements Creature{
    private String name ="Person";
    private  int age;
    private boolean canFly;

    public Person (int age,boolean canFly)
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
