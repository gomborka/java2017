package com.borka;

/**
 * Created by Comp14 on 07/09/2017.
 */
public class Liri extends Person implements Runnable {
    @Override
    public void run() {
        System.out.println("from Liri");
    }
}
