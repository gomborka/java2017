package com.borka;

/**
 * Created by Comp14 on 03/09/2017.
 */
public class CinemaCity {
    Hall mainHall;



    public void addHall(int numOfSeats)
    {
        if (mainHall==null) {
            mainHall = new Hall(numOfSeats);
        }
    }

    public void buyTicket(int seat) {
        if (seat >=0 && seat <= mainHall.getSeats().length) {
            mainHall.seatSold(seat);
        }else {
            mainHall.seatSold();
        }

    }

    public void buyTicket (){
         mainHall.seatSold();
    }

    public void printHall()
    {
        for (int i = 0; i < mainHall.getSeats().length ; i++) {
            System.out.println(mainHall.getSeats()[i]);
        }
    }

}

