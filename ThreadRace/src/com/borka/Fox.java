package com.borka;

/**
 * Created by Comp14 on 10/09/2017.
 */
public class Fox extends Thread {

    public  void run() {

        try {
            System.out.println("Fox STARTS");
            for (int i = 0; i < 10; i++) {
               System.out.println("Fox run:" +  i + " meters"  );
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fox FINISHED");
    }
}
