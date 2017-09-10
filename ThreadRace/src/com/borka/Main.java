package com.borka;

public class Main {

    public static void main(String[] args) {

        Thread rabbit = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Rabbit STARTS");
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Rabbit run : " + i + " meters");
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Rabbit FINISHED");
            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Lion STARTS");
                    for (int i = 0; i < 10; i++) {
                       System.out.println("Lion run : " + i + " meters");
                        Thread.sleep(1000);
                    }
                    System.out.println("Lion FINISHED");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        Thread volf = new Thread (new Volf ()) ;
        Fox fox = new Fox();

        rabbit.setPriority(Thread.MAX_PRIORITY);
        volf.setPriority(Thread.MAX_PRIORITY);
        fox.setPriority(Thread.MAX_PRIORITY);

        rabbit.start();
        volf.start();
        fox.start();

        try {
             System.out.println("Bear STARTS");
            for (int i = 0; i < 10; i++) {

                System.out.println("Bear run : " + i + " meters");
                Thread.sleep(1000);

            }
        }catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println("Bear FINISHED");


}
}
