package com.borka;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

   static HashMap <String, Integer> eatItem = new HashMap <String,Integer>();

    public static void main(String[] args) {

        User a =new User("AAA","111");
        User b =new User("BBB","222");
        User c =new User("CCC","333");

        int priceDrink;
        int priceEat;
        HashMap <String, Integer> eatItem = new HashMap <String,Integer>();
        eatItem.put("Cola",10);
        eatItem.put("Fanta",15);
        eatItem.put("Orange",6);
        eatItem.put("Hamburger",40);
        eatItem.put("Naggets",30);
        eatItem.put("Hot Dog",20);


     //   User [] users = new User(a,b,c);
//        User [] users = null;
//        users [0] = a;

      //  System.out.println(users.toString());
       // HashMap hashMap = new HashMap();


        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter user");
//        String u =sc.nextLine();
//        System.out.println("Enter password");
//        String p =sc.nextLine();

        System.out.println("What od you want to drink: cola,fanta,orange ?");
        String drink =sc.nextLine();

        if (drink != null ) {
             priceDrink = eatItem.get(drink);
        }
        else {
            priceDrink = 0;
        }

        System.out.println(priceDrink);

        System.out.println("What od you want to eat: hamburger,naggets,hot dog ?");
        String eat =sc.nextLine();

        if (eat != null ) {
            priceEat = eatItem.get(eat);
        }
        else {
            priceEat = 0;
        }


        System.out.println(priceEat);
        System.out.println("Please pay :" + getPrice(eat) + getPrice (drink));


//        for ( Map.Entry<String, Integer> entry : eatItem.entrySet()) {
//            String key = entry.getKey();
//            Tab tab = entry.getValue();
//            // do something with key and/or tab
//        }


        //   login (u,p);

    }

//        public static User login(String u, String p)
//        {
//
//        }

    public static int getPrice (String str)
    {
        int price;
        if (str!= null ) {
            price = eatItem.get(str);
        }
        else {
            price = 0;
        }
        return price;
    }
}

