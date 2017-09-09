package com.borka;

public class MainFirstExample {

    public static void main(String[] args) {


 // 1st  : create object from class Thread that inside of Constructor gets interface Runnable
 // 2rd : Create JAVA class that inherit from class Thread
 // 3rd : like 1st way , create object form class Thread and that inside of constructor get class that implement Runnable
 // Every  way must implement method Run


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {

                    try {
                        System.out.println("T1:" + i);
                        Thread.sleep(400);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("T1 is Done");
            }
        });
	t1.start();


        for (int i = 0; i < 20 ; i++) {


            try {
                System.out.println("m1:" + i);
                Thread.sleep(400);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("MainFirstExample is Done");
    }
}
