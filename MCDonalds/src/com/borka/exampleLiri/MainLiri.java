package com.borka.exampleLiri;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Comp14 on 07/09/2017.
 */
public class MainLiri {

    static HashMap<String, Integer> products = new HashMap <String,Integer>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Hello");
        checkUser();


    }

    public static void checkUser() {
        System.out.println("Enter user");
        String username = sc.nextLine();
        System.out.println("Enter password");
        String userPassword = sc.nextLine();

        // if (User.users.get(username)!= null && User.users.get(username))

        if (User.users.get(username).equals(userPassword)) {
            System.out.println("logged in");
            orderDrinks();
            orderEat();
            checkout();
        } else {
            System.out.println("Wrong User");

        }
    }

    public static void orderDrinks() {
        System.out.println("What do you want to drink : cola,fanta, orange");
        String drink = sc.nextLine();

        switch (drink){
            case "cola":
                System.out.println("cola cost 15");
                products.put ("cola", 15);
                break;

            case "fanta":
                System.out.println("fanta cost 10");
                products.put ("fanta", 10);
                break;
            case "orange":
                System.out.println("orange 15");
                products.put ("orange", 5);
                break;
            default:
                System.out.println("wrong item");
                break;
        }
    }

    public static void orderEat() {
        System.out.println("What do you want to eat: hamburger,naggets,hot dog ?");
        String food = sc.nextLine();

        switch (food) {
            case "hamburger":
                System.out.println("hamburger cost 30");
                products.put("hamburger", 10);
                break;
            case "naggets":
                System.out.println("naggets cost 20");
                products.put("naggets", 20);
                break;
            case "hot dog":
                System.out.println("hot dog 10");
                products.put("hot dog cost ", 10);
            default:
                System.out.println("wrong item");
                break;
        }

    }

      public static void checkout() {
          int price = 0;
          System.out.println("Order will ready 5 sec");

          for (int i = 4; i > 1; i--) {
          try {
              Thread.sleep(1000);
              System.out.println(i);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }

          for (String key: products.keySet())
          {
              price += products.get(key);
          }
          System.out.println("Ready , please pay :" + price);
        }
    }