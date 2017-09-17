package com.lightApps;

/**
 * Created by USER on 9/7/2017.
 */
public class LiriThread extends Thread {

    String name = "liriThread";


    @Override
    public void run() {
        System.out.println("from " + name);

    }
}
