package com.borka;

/**
 * Created by Comp14 on 03/09/2017.
 */
public class MainForeach {

    public static void main(String[] args) {


    String [] students = {"yossi","Natalia","Shay"};

//    for (int i=0; i < students.length;i++)
//    {
//        System.out.println(students[i]);
//    }

        for (String curr: students
             ) {
            System.out.println(curr);
        }
    }
}