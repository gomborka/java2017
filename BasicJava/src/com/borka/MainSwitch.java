package com.borka;

public class MainSwitch {

    public static void main(String[] args) {

    String name = "Yossi";
    changeName(name);


    }

 public static void changeName (String s)
 {
     switch (s)
     {
         case "snirf" :
             System.out.println("Yea.Ma name");
             break;
          case "Yossi":
              System.out.println("thsi is boy");
             break;

           case ("Boris"):
               System.out.println("No no");
            break;
           default:
               System.out.println("default");




     }

 }
}
