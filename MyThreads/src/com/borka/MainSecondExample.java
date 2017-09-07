package com.borka;

/**
 * Created by Comp14 on 07/09/2017.
 */
public class MainSecondExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
//                for (int i = 0; i < 20; i++) {
//
//                    try {
//                        System.out.println("T1:" + i);
//                        Thread.sleep(400);
//
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
                System.out.println("T1 is Done");
            }
        });
        t1.start();

        LiriThread t2= new LiriThread();
        t2.start();

        Thread t3 = new Thread(new Liri());
        t3.start();

        System.out.println("Main is Done");
    }
}
