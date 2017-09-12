package com.borka;

import javax.swing.*;

public class MainDialogWin {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Hello Class");
        String name = JOptionPane.showInputDialog("Enter name");
       // JOptionPane.showMessageDialog(null,name);

        String msg = "what si your favorite food";
        String title = "seeker";
        String [] food ={"pasta","pizza","suschi","stake","humus"};

        String myFood = (String)JOptionPane.showInputDialog(null,msg,title,JOptionPane.QUESTION_MESSAGE,null,food,food[2]);
        String msg2 =(name +" likes "+myFood);
        JOptionPane.showMessageDialog(null,msg2);

        int answer = JOptionPane.showOptionDialog(null,"choose smethong","the title",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE,null,food,null);

        switch(answer){

            case 0:
                JOptionPane.showMessageDialog(null,"pasta");
               // System.out.println("yes");
                break;
            case 1:
                JOptionPane.showMessageDialog(null,"pizza");
              //  System.out.println("no");
                break;
            case -1:
                JOptionPane.showMessageDialog(null,"What");
              //  System.out.println("close");
                break;
            default:
                break;

        }
    }
}
