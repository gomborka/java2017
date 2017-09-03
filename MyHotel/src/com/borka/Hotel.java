package com.borka;


public class Hotel {

   private  static int idOfRooms=0;
     private Room [] rooms;

    public Hotel(int numOfRooms) {
        this.rooms = new Room [numOfRooms];

    }

    public void addNewRoom (String roomName)
    {
     if(idOfRooms<rooms.length)
     {
         rooms[idOfRooms++] = new Room (roomName);
     }
    }

 public void changeRoom(int index,String newName)
 {
     if (index<rooms.length) {
         rooms[index].setName(newName);
     }
    else System.out.println("Enter index correct");
 }

 public void printAllRooms()
 {

     for (Room room: rooms
          ) {
         System.out.println(room.toString());
     }
 }

}
