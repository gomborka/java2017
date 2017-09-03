package com.borka;

public class Main {

    public static void main(String[] args) {
        CinemaCity rishon = new CinemaCity();

        rishon.addHall(6);
        rishon.buyTicket ();
        rishon.buyTicket (2);
        rishon.buyTicket(5);
        rishon.printHall();

    }
}
