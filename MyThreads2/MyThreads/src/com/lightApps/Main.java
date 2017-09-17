package com.lightApps;

public class Main {

    public static void main(String[] args) {


//////////////////
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("from t1");
//            }
//        });
//        t1.start();
//
/////////////////
//        LiriThread t2 = new LiriThread();
//        t2.start();
//
//
//        ////
//        Thread t3 = new Thread(new Liri());
//        t3.start();


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Rabbit starts running...");
                for (int i = 0; i < 15; i++) {
                    try {
                        Thread.sleep(100);
                        System.out.println("Rabbit past " + i + " meters!");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Rabbit finished the race!");
            }
        });


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Ninjaturtle starts running...");
                for (int i = 0; i < 15; i++) {
                    try {
                        Thread.sleep(100);
                        System.out.println("Ninjaturtle past " + i + " meters!");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Ninjaturtle finished the race!");
            }
        });

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();


    }
}
