package com.company.manage;

import com.company.animal.Animal;

/**
 * Created by borka on 9/2/2017.
 */
public class Zoo {
    public Cage[] cages = new Cage[3];


    public Zoo() {
        this.cages[0] = new Cage("Ground Cage");
        this.cages[1] = new Cage("Water Cage");
        this.cages[2] = new Cage("Air Cage");
    }


    public  void add (Animal animal, Cage cage)
    {

    }

    public void addAnimalToCage (Animal animal) {


        switch (animal.getPlace()) {
            case "ground":
            {
               add(animal

                break;

            }

            case "water":
            {

                break;

            }
            case "air":
            {

                break;

            }
        default:
        }


//      if(animal.getPlace().equals("ground")) {
//
//
//      }
//
//
//      }
////           for (int i=0; i< wildCage.length-1;i++)
////           {
////
////           }
//            int i = 0;
//            while ( cage.wildCage[i] != null && i <= wildCage.length){
//                i++;
//            }
//            if (i> wildC )
//            {
//                wildCage [i] = animal;
//            }
//        }
//        }
    }
}
