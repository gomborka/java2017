package com.borka;

public class Main {

    public static void main(String[] args) {

        Hotel danPanorama = new Hotel (6);

        danPanorama.addNewRoom("guest room");
        danPanorama.addNewRoom("play room");
        danPanorama.addNewRoom("video room");

        danPanorama.changeRoom(1, "spa");


       danPanorama.printAllRooms();
    }
}
