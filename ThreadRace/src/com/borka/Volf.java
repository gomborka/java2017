package com.borka;

/**
 * Created by Comp14 on 10/09/2017.
 */
public class Volf implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Volf STARTS");
            for (int i = 0; i < 10; i++) {

                System.out.println("Volf run:" +  i + " meters"  );
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Volf FINISHED");
    }
}
