package com.borka;

/**
 * Created by Comp14 on 03/09/2017.
 */
public class Hall {

    boolean[] seats;

    public Hall(int numOfSeats) {

        seats = new boolean[numOfSeats];
    }

    public boolean[] getSeats() {
        return seats;
    }

    public void seatSold()
    {
        for (int i = 0; i < seats.length; i++) {
            if(!seats[i])
            {
                seats[i]=true;
                return;
            }

        }
    }
}
