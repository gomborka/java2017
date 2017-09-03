package com.borka.oop;

/**
 * Created by Comp14 on 31/08/2017.
 */
public class MainOOP {
    public static void main(String[] args) {

        //    Animal a =new Animal ("animal",12,true);
//        Animal bird = new Animal ("bird",5,true);
//        Animal lion = new Animal("lion",10, false);
        // System.out.println(a);
//        System.out.println("bird can fly: " + bird.isCanFly());
//        System.out.println("lion can flay: " + lion.isCanFly());
//

        Animal animal = new Animal(30, false);
        Animal bird = new Bird(5, true);
        Animal lion = new Lion(10, false);
        Person person = new Person(32, false);

//        System.out.println(person.getName());
//        System.out.println(lion.getName());
//        System.out.println(bird.getName());
//        System.out.println(bird.getName());

        checkName(lion);
        checkName(bird);
        checkName(person);

        printName(lion);

    }

//public static void printName (Living living)
//{
//    System.out.println(living.getName());
//}

    public static void printName (Creature creature)
    {
        System.out.println(creature.getName());
    }

    public static void checkName(Object object) {
    if (object instanceof  Bird)
        System.out.println("111 "+ ((Bird) object).getName());
        if (object instanceof  Lion)
            System.out.println("222 " + ((Lion) object).getName());
        if (object instanceof  Person)
            System.out.println("333 " + ((Person) object).getName());

    }
}
