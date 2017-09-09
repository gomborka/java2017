package com.borka.collections;

import java.util.HashMap;

/**
 * Created by Comp14 on 05/09/2017.
 */
public class MainHashMap {

    private static HashMap<String, Double> fruits;

    public static void main(String[] args) {


        fruits = new HashMap<>();

        fruits.put("apple", 3.50);
        fruits.put("banana", 15.0);
        fruits.put("orange", 6.0);

        addVat(fruits);

    }

    private static void addVat(HashMap<String, Double> fruits) {
        for (String key: fruits.keySet()){
            double price = fruits.get(key);
            price *= 1.17;
            fruits.put(key,price);
        }

        System.out.println(fruits);



    }
}
